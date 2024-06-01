package main.java.list.Pesquisa;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List numList;

    public SomaNumeros() {
        this.numList = new ArrayList();
    }
    public void addNum(int num) {
        numList.add(num);
    }

    public int caclculateSum() {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += (int) numList.get(i);
        }
        return sum;
    }

    public int findHigherNum() {
        int h = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (((int) numList.get(i)) > h) {
                h = (int) numList.get(i);
            }
        }
        return h;
    }

    public int findLowerNum() {
        int l = 99999999;
        for (int i = 1; i < numList.size(); i++) {
            if ((int) numList.get(i) < l) {
                l = (int) numList.get(i);
            }
        }
        return l;
    }

    public void showNums() {
        System.out.println(numList);
    }

    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();

        num.addNum(2);
        num.addNum(3);
        num.addNum(5);
        num.addNum(10);


        System.out.println(num.caclculateSum());
        System.out.println(num.findHigherNum());
        System.out.println(num.findLowerNum());
    }
}
