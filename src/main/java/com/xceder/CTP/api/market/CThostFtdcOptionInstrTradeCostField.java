package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u671f\u6743\u4ea4\u6613\u6210\u672c<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcOptionInstrTradeCostField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(3) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(3) 
	public CThostFtdcOptionInstrTradeCostField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(4) 
	public double FixedMargin() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(4) 
	public CThostFtdcOptionInstrTradeCostField FixedMargin(double FixedMargin) {
		this.io.setDoubleField(this, 4, FixedMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public double MiniMargin() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public CThostFtdcOptionInstrTradeCostField MiniMargin(double MiniMargin) {
		this.io.setDoubleField(this, 5, MiniMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public double Royalty() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public CThostFtdcOptionInstrTradeCostField Royalty(double Royalty) {
		this.io.setDoubleField(this, 6, Royalty);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public double ExchFixedMargin() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public CThostFtdcOptionInstrTradeCostField ExchFixedMargin(double ExchFixedMargin) {
		this.io.setDoubleField(this, 7, ExchFixedMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public double ExchMiniMargin() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public CThostFtdcOptionInstrTradeCostField ExchMiniMargin(double ExchMiniMargin) {
		this.io.setDoubleField(this, 8, ExchMiniMargin);
		return this;
	}
	public CThostFtdcOptionInstrTradeCostField() {
		super();
	}
	public CThostFtdcOptionInstrTradeCostField(Pointer pointer) {
		super(pointer);
	}
}