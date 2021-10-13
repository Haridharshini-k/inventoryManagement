package kiranaStoreNew.inventoryManagementNew.dto;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Order 
{
	private Integer orderId;
	private Integer empId;
	private Integer cid;
	private Integer pId;
	private Integer orderQuantity;
	private Timestamp orderDate;
	private Integer totalPrice;
	
	public Order() {
		
		
	}
	
	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order(Integer orderId, Integer empId, Integer cid, Integer pId, Integer orderQuantity,Timestamp orderDate,
			Integer totalPrice) {
		super();
		this.orderId = orderId;
		this.empId = empId;
		this.cid = cid;
		this.pId = pId;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public Integer getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() 
	{
		//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(orderDate);
		//String timeStamp=orderDate.toString();
		//return String.format("|%-5d | %-5d | %-5d | %-5d |%-5d |%-10s |%d\n",orderId,empId,pId,orderQuantity,timeStamp,totalPrice);
		return "Order [orderId=" + orderId + ", empId=" + empId + ", cid=" + cid + ", pId=" + pId + ", orderQuantity="
				+ orderQuantity + ", orderDate=" + orderDate + ", totalPrice=" + totalPrice + "]";
	}
	
	
	

}
