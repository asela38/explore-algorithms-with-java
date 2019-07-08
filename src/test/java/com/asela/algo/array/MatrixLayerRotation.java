package com.asela.algo.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem URL <url>https://www.hackerrank.com/challenges/matrix-rotation-algo/problem</url>
 */
public class MatrixLayerRotation {

    @Test
    public void test1x1Matrix() {
        List<List<Integer>> original = new ArrayList<>();
        original.add(Arrays.asList(1));

        matrixRotation(original, 1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));

        verify(original, expected);

    }

    private void verify(List<List<Integer>> original, List<List<Integer>> expected) {
        for(int i = 0 ; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i).size(), original.get(i).size());
            for(int j = 0; j < expected.get(i).size(); j++) {
                Assert.assertEquals(expected.get(i).get(j), original.get(i).get(j));
            }
        }
    }

    static void matrixRotation(List<List<Integer>> matrix, int r) {


    }

}
