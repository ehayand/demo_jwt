package com.example.jwt2.security;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ehay@naver.com on 2018-10-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class HeaderTokenExtractorTest {

    private HeaderTokenExtractor extractor = new HeaderTokenExtractor();
    private String header;

    @Before
    public void setUp(){
        this.header = "Bearer alkdjsflakjsdf.alsdkjflakdsf.alsdkfjladkfj";
    }

    @Test
    public void TEST_JWT_EXTRACT(){
        assertThat(extractor.extract(this.header), is("alkdjsflakjsdf.alsdkjflakdsf.alsdkfjladkfj"));
    }

}