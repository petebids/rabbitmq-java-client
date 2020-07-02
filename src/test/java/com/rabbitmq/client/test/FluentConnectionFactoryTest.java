package com.rabbitmq.client.test;

import org.junit.Test;
import com.rabbitmq.client.ConnectionFactory;

import com.rabbitmq.client.impl.nio.NioParams;


public class FluentConnectionFactoryTest {
    

    @Test
    public void budildsFluentlyWithCUstomNio(){
        NioParams np = new NioParams()
            .enableHostnameVerification();
        
        ConnectionFactory cf = new ConnectionFactory()
            .host("")
            .port(1000)
            .nio(np)
            .handshakeTimeout(100)
            ;
    }
    
    @Test
    public void buildsFluentlyUsingDefaultNio() {
        ConnectionFactory cf = new ConnectionFactory()
                .host("")
                .port(1000)
                .nio(null)
                .handshakeTimeout(100)
                ;
        }
        
    }
}