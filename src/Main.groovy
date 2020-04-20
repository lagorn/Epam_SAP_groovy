class Main {
    public static void main(String[] args) {
        def primes = [2, 3, 5, 7, 11, 24, 1, 9, 0]

        int temp;
        def sortArray = { list ->
            for (int j = 0; j < list.size; j++) {
                for (int i = 0; i < list.size -1 ; i++) {
                    if (list[i] > list[i+1]){
                        temp = list[i];
                        list[i] = list[i+1];
                        list[i+1] = temp;
                    }
                }
            }
            return list
        }
        println(sortArray(primes))

        //println("groovy гамно")

        //Задание 2

        def mainPas = new Main()

        def squaring = {int num -> return (num*num)}

        def acceptNumber = {int number -> squaring.call(number)}

        println(acceptNumber(4))


    }

}
