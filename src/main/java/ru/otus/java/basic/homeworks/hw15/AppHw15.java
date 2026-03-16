package ru.otus.java.basic.homeworks.hw15;

public class AppHw15 {

    public static void main(String[] args) {
        String[][] matrix1 = {{"1","2","3","4"},
                              {"5","6","7","8"},
                              {"9","10","11","12"},
                              {"13","14","15","16"},
                              {"17","18","19","20"}};

        String[][] matrix2 = {{"1","2","3","4"},
                              {"5","6","7","8"},
                              {"9","10","11","12"},
                              {"13","14","int","16"}};

        String[][] matrix3 = {{"1","2","3","4"},
                              {"5","6","7","8"},
                              {"9","10","11","12"},
                              {"13","14","15","16"}};


        try {
            arrayMethod(matrix1);
        }
        catch (AppArraySizeException | AppArrayDataException e){
            System.out.println(e.getMessage());
        }

        try {
            arrayMethod(matrix2);
        }
        catch (AppArraySizeException | AppArrayDataException e){
            System.out.println(e.getMessage());
        }

        try {
            arrayMethod(matrix3);
        }
        catch (AppArraySizeException | AppArrayDataException e){
            System.out.println(e.getMessage());
        }
    }






    public static void arrayMethod(String[][] strMatrix) throws AppArraySizeException, AppArrayDataException {
        int len_width = strMatrix.length;
        int len_height = strMatrix[0].length;
        int resultSum = 0;

        if (len_width != 4 || len_height != 4) {
            throw new AppArraySizeException("Размер массива должен быть 4Х4");
        }

        for (int i = 0; i < len_width; i++) {
            for (int j = 0; j < len_height; j++) {

                try{
                    resultSum += Integer.parseInt(strMatrix[i][j]);
                }catch(NumberFormatException e) {
                    throw new AppArrayDataException("Значения внутри массива должны быть числовыми.");
                }
            }
        }
        System.out.println("ResultSum = " + resultSum);
    }

}
