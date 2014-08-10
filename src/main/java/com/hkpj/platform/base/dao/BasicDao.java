// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicDao.java

package com.hkpj.platform.base.dao;


public interface BasicDao
{

	public abstract Integer insert(Object obj);

	public abstract void delete(Object obj);

	public abstract Integer update(Object obj);

	public abstract Object selectById(Object obj);
}
