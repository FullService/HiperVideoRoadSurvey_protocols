// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HVRSURLStreamHandlerFactory.java

package br.srv.full.url.protocol;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

// Referenced classes of package br.srv.full.url.protocol:
//            AVRURLStreamHandler

public class HVRSURLStreamHandlerFactory
    implements URLStreamHandlerFactory
{

    public HVRSURLStreamHandlerFactory()
    {
    }

    public URLStreamHandler createURLStreamHandler(String protocol)
    {
        if("AVR".equalsIgnoreCase(protocol))
            return AVRURLStreamHandler.getInstance();
        else
            return null;
    }

    public static URLStreamHandlerFactory getInstance()
    {
        if(instance == null)
            instance = new HVRSURLStreamHandlerFactory();
        return instance;
    }

    private static HVRSURLStreamHandlerFactory instance;
}
