package com.elevenst.unittest;

import com.elevenst.unittest.iloveyouboss.ScoreCollection;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        //준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //실행
        int actualResult = collection.arithmeticMean();

        //단언
        assertThat(actualResult, equalTo(6));
    }
}
