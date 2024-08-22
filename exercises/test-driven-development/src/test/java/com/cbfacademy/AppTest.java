package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();
        assertThat(app, is(notNullValue()));
    }

}