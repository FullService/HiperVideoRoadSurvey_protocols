// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AVRURLStreamHandler.java

package br.srv.full.url.protocol;

import java.io.IOException;
import java.net.*;

public class AVRURLStreamHandler extends URLStreamHandler
{

    public AVRURLStreamHandler()
    {
    }

    protected URLConnection openConnection(URL u)
        throws IOException
    {
        return null;
    }

    public static URLStreamHandler getInstance()
    {
        if(instance == null)
            instance = new AVRURLStreamHandler();
        return instance;
    }

    private static AVRURLStreamHandler instance;
}
