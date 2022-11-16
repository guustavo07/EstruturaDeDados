package Binaria;

import java.util.ArrayList;

public class DesenharArvore {

    static void startDrawing(PesquisaBinaria tree)
    {
        int height = tree.height();

        ArrayList[] classes = new ArrayList[height];
        for (int i=0; i<height; i++) {
            classes[i] = new ArrayList<>();
        }

        divideTreeIntoLevels(tree, height, classes);
        drawTree(classes);
    }

    static void divideTreeIntoLevels(PesquisaBinaria current, int height, ArrayList[] classes) {
        if(current == null || height==0) {
            return;
        }

        if(current.isEmpty()) {
            int index = classes.length - 1;
            while(index >= classes.length-height) {
                int times = calculateExponent(2, index-(classes.length-height));
                for(int i=0; i<times; i++) {
                    classes[index].add(null);
                }
                index--;
            }
            return;
        } else {
            if(height >= 1) {
                divideTreeIntoLevels(current.getLeftChild(), height-1, classes);
                divideTreeIntoLevels(current.getRightChild(), height-1, classes);

                classes[classes.length - height].add(current.getContent());
            }
        }
    }

    static void drawTree(ArrayList<Integer>[] classes) {
        final String P1 = "   ";
        final String P2 = "  _";
        final String P3 = "_  ";
        final String P4 = "___";
        final String P5 = " | ";

        for (int i=0; i<classes.length; i++) {
            String sep = "";  
            String line = "";

            int times = (classes[classes.length-i-1].size() / 2) - 1;

            for(int j=0; j<classes[i].size(); j++) {

                if(j != 0) {
                    sep += P1;
                    line += P1;
                }


                if(i > 0) {
                    int sepTimes = times * 2 + 1; 

                    String microPattern = classes[i].get(j) != null ? P5 : P1;
                    sep += patternTimes(P1, sepTimes) + microPattern + patternTimes(P1, sepTimes);
                }
                if(classes[i].get(j) != null) {

                    if(i == classes.length-1) {
                        line += fillNumber(classes[i].get(j));

                    } else {

                        if(classes[i+1].get(j*2) != null) {
                            line += patternTimes(P1, times) + P2 + patternTimes(P4, times);
                        } else {

                            line += patternTimes(P1, times * 2 + 1);
                        }

                        line += fillNumber(classes[i].get(j));

                        if(classes[i+1].get(j*2+1) != null) {
                            line += patternTimes(P4, times) + P3 + patternTimes(P1, times);
                        } else {

                            line += patternTimes(P1, times * 2 + 1);
                        }
                    }
                } else {

                    int extra = i != classes.length-1 ? 3 : 1;
                    line += patternTimes(P1, times * 4) + patternTimes(P1, extra);
                }


            }
            System.out.println(sep);
            System.out.println(line);
        }
    }

    static void showLevelsList (ArrayList[] classes) {
        for (ArrayList arr : classes) {
            String line = "";
            for (Object el : arr) {
                line = line + (el != null ? el.toString() : null) + " ";
            }
            System.out.println(line);
        }
    }

    static int calculateExponent(int base, int expo) {
        if(base == 0 || base == 1) {
            return base;
        }
        int res = 1;
        for (int i=0; i<expo; i++) {
            res *= base;
        }
        return res;
    }
    static String patternTimes(String pattern, int times) {
        String str = "";
        for(int i=0; i<times; i++) {
            str += pattern;
        }
        return str;
    }

    public static String fillNumber(Integer num) {
        if(num >= 0 && num < 10) {
            return " " + num.toString() + " ";
        }
        if(num < 0 && num > -10 || num >= 10 && num <100) {
            return " " + num.toString();
        }
        return "" + num;
    }
}
