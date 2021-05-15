package com.company.advanced.exception;

public class Numbers implements Comparable<Numbers> {

    int num;


    public Numbers(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Numbers numbers) {
        return Integer.compare(num, numbers.num);
    }

//    private static void testException() {
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//
//        if (num == 0) {
//            throw new CustomException("This is a customised error");
//        }
//
//        if (num == 1) {
//            throw new OneException("This is 1");
//        }
//    }
}
