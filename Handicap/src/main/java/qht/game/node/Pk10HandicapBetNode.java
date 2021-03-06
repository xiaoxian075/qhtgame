package qht.game.node;

import java.math.BigDecimal;

public class Pk10HandicapBetNode {
	private long id;
	private String odd;	//单号
	private String period;	//期号
	private int runway;				//车道(1~10表示冠军道~第10道 11表示冠亚和)
	private int bettype;			//投注值(大/20 小/21 单/22 双/23 龙/24 虎/25 1~19中的一个)
	private BigDecimal betamount;	//投注金额
	private int status;				//状态 1_投注 2_结算 3_处理失败
	private String eventuate;	//返回结果
	private long updatetime;	//更新时间
	private long createtime;	//创建时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOdd() {
		return odd;
	}
	public void setOdd(String odd) {
		this.odd = odd;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public int getRunway() {
		return runway;
	}
	public void setRunway(int runway) {
		this.runway = runway;
	}
	public int getBettype() {
		return bettype;
	}
	public void setBettype(int bettype) {
		this.bettype = bettype;
	}
	public BigDecimal getBetamount() {
		return betamount;
	}
	public void setBetamount(BigDecimal betamount) {
		this.betamount = betamount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getEventuate() {
		return eventuate;
	}
	public void setEventuate(String eventuate) {
		this.eventuate = eventuate;
	}
	public long getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(long updatetime) {
		this.updatetime = updatetime;
	}
	public long getCreatetime() {
		return createtime;
	}
	public void setCreatetime(long createtime) {
		this.createtime = createtime;
	}
}
