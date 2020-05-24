package com.netflix.client.config;

import com.google.common.collect.Sets;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonClientConfigKeyTest {
    
    @Test
    public void testCommonKeys() {
        IClientConfigKey[] keys = CommonClientConfigKey.values();
        assertTrue(keys.length > 30);
        assertEquals(Sets.newHashSet(keys), CommonClientConfigKey.keys());
        assertTrue(CommonClientConfigKey.keys().contains(CommonClientConfigKey.ConnectTimeout));
    }
}
