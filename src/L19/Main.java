package L19;

public class Main {

    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {
        String[][] array = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] array2 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1"},{"1","1","1","1"}};
        String[][] array3 = new String[][]{{"1","1","1","1"},{"1","1","one","1"},{"1","1","1","1"},{"1","1","1","1"}};

        try {
            sumArray(array);
        } catch (arraySizeException | arrayDataException e) {
            e.printStackTrace();
        }

        try {
            sumArray(array2);
        } catch (arraySizeException | arrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            sumArray(array3);
        } catch (arraySizeException | arrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void sumArray(String[][] array) throws arraySizeException, arrayDataException {
        checkArray(array);

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array.length; k++){
                try {
                    sum += Integer.parseInt(array[i][k]);
                } catch (NumberFormatException e){
                    e.printStackTrace(); //нельзя терять причину ошибки (то есть е)
                    throw new arrayDataException(i,k);
                }
            }
        }
        System.out.println("Array sum = " + sum);
    }

    private static void checkArray(String[][] array) throws arraySizeException {
        if(array.length != ARRAY_SIZE){
            throw new arraySizeException();
        }

        for (String[] strings : array) {
            if(strings.length != ARRAY_SIZE){
                throw new arraySizeException();
            }
        }
    }
}
