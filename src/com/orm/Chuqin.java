package com.orm;

public class Chuqin
{
	private int id;
	private String yuefen;
	private int tianshu;
	private int yuangong_id;
	
	private Yuangong yuangong;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getTianshu()
	{
		return tianshu;
	}
	public void setTianshu(int tianshu)
	{
		this.tianshu = tianshu;
	}
	public int getYuangong_id()
	{
		return yuangong_id;
	}
	public void setYuangong_id(int yuangong_id)
	{
		this.yuangong_id = yuangong_id;
	}
	public String getYuefen()
	{
		return yuefen;
	}
	public void setYuefen(String yuefen)
	{
		this.yuefen = yuefen;
	}
	public Yuangong getYuangong()
	{
		return yuangong;
	}
	public void setYuangong(Yuangong yuangong)
	{
		this.yuangong = yuangong;
	}
	
	
}
