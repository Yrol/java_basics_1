package com.yrol;

public class Counter {

    public static int count;
    public int anotherCount;

    // Constructor
    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {

        // Instances of Counter and the above constructor will be called.
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        /*
         * Static count shared
         * - Static count will be shared across instances
         */

        // Since the static counter is a shared instance it will be the same across
        // following instances
        System.out.println(count); // 4
        System.out.println(one.count); // 4
        System.out.println(two.count); // 4
        System.out.println(three.count); // 4
        System.out.println(four.count);// 4

        count++;

        System.out.println(count); // 5
        System.out.println(one.count); // 5
        System.out.println(two.count); // 5
        System.out.println(three.count); // 5
        System.out.println(four.count);// 5

        /*
         * Non-static anotherCount
         * Non-static anotherCount won't be shared across the instances
         */

        System.out.println(one.anotherCount); // 1
        System.out.println(two.anotherCount); // 1
        System.out.println(three.anotherCount); // 1
        System.out.println(four.anotherCount);// 1

        one.anotherCount = 4;
        System.out.println(one.anotherCount); // 4
    }
}
