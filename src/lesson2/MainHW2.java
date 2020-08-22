package lesson2;

public class MainHW2 {
    public static void main(String[] args) {

        String[][] arr = {
                {"1","1","1"},
                {"2","2","2"},
                {"1","1","1","1"},
                {"2","2","2"}
        };

        String[][] arrS = {
                {"1","1","1","1"},
                {"1","1","1Char","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };

        String[][] arr4x4 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };

//Не правильная размерность массива
        tryCatch(arr);
//Правильный массив без Exception
        tryCatch(arr4x4);
//Массив со строкой
        tryCatch(arrS);

    }

    public static void tryCatch(String arr[][]){
        try {

            System.out.printf("Сумма элементов массива = %d\n", sumElementsArray(arr));

        }catch (MyArraySizeException e){

            System.out.printf("Size %dx%d Not equal 4x4\n",e.getX(),e.getY());

        }catch (MyArrayDataException e){

            System.out.printf("Element [%d.%d] = %s\nNot a number!!!\n", e.getX(),e.getY(),e.getElement());

        }
    }

    public static int sumElementsArray(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr.length != 4 || arr[i].length != 4){

                throw new MyArraySizeException(arr.length,arr[i].length);

            };

            for (int j = 0; j < arr[i].length; j++) {

                try {

                    sum +=Integer.parseInt(arr[i][j]);

                }catch (NumberFormatException e){

                    throw new MyArrayDataException(arr[i][j], i, j);

                }
            }
        }
        return sum;
    }
}
