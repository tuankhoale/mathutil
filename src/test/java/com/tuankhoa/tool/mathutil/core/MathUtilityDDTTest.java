package com.tuankhoa.tool.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //TÁCH DATA RA KHỎI HÀM TEST
    //DỰNG 1 MẢNG 2 CHIỀU, INPUT, EXPECTED
    //SAU ĐÓ NHỒI VÀO, FILL VÀO CÂU LỆNH SO SÁNH!!!
    //MẢNG NÀY SẼ LÀ NGUỒN DỮ LIỆU ĐỂ SO SÁNH GỌI, NHIỀU LẦN NHƯ THẾ, DO NHIỀU DATA => NGUỒN NÀY LÀ STATIC ĐỂ TÌM KIẾM NHANH CHÓNG

    public static Object[][] intitTestData() {
        return new Object[][] { {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720},
                                  };

    }

     @ParameterizedTest
     @MethodSource("intitTestData")
      public void testFactorialGivenRightArgumenRunsWell(int n, long expected){
          assertEquals(expected, MathUtility.getFactorial(n));
      }

}