package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6b63\u5728\u540c\u6b65\u4e2d\u7684\u5408\u7ea6\u4fdd\u8bc1\u91d1\u7387<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcSyncingInstrumentMarginRateField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public CThostFtdcSyncingInstrumentMarginRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(4) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(4) 
	public CThostFtdcSyncingInstrumentMarginRateField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public double LongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
		this.io.setDoubleField(this, 5, LongMarginRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public double LongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
		this.io.setDoubleField(this, 6, LongMarginRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(7) 
	public double ShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcRatioType */
	@Field(7) 
	public CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 7, ShortMarginRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public double ShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 8, ShortMarginRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(9) 
	public int IsRelative() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcBoolType */
	@Field(9) 
	public CThostFtdcSyncingInstrumentMarginRateField IsRelative(int IsRelative) {
		this.io.setIntField(this, 9, IsRelative);
		return this;
	}
	public CThostFtdcSyncingInstrumentMarginRateField() {
		super();
	}
	public CThostFtdcSyncingInstrumentMarginRateField(Pointer pointer) {
		super(pointer);
	}
}