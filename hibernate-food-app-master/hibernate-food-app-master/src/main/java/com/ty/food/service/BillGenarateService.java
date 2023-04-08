package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.BillGenareteDao;
import com.ty.food.dao.ItemDao;
import com.ty.food.dto.BillGenarate;
import com.ty.food.dto.Item;

public class BillGenarateService {
	BillGenareteDao dao = new BillGenareteDao();
	public BillGenarate saveBillGenarateService(BillGenarate billGenarate)
	{
		return dao.getBillGenarate(billGenarate);
	}
	public BillGenarate getBillGenarateServiceById(int id)
	{
		return dao.getBillGenarateById(id);
	}
	public List<BillGenarate> getAllBillGenarateService()
	{
		return dao.getAllBillGenarate();
	}
	public BillGenarate deleteBillGenarateServiceById(int id)
	{
		return dao.deleteBillGenarateById(id);
	}
}
