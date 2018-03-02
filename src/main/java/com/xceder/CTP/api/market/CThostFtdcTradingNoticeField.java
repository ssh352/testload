package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7528\u6237\u4e8b\u4ef6\u901a\u77e5<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcTradingNoticeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public CThostFtdcTradingNoticeField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcSequenceSeriesType */
	@Field(3) 
	public short SequenceSeries() {
		return this.io.getShortField(this, 3);
	}
	/** C type : TThostFtdcSequenceSeriesType */
	@Field(3) 
	public CThostFtdcTradingNoticeField SequenceSeries(short SequenceSeries) {
		this.io.setShortField(this, 3, SequenceSeries);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > SendTime() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(6) 
	public int SequenceNo() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(6) 
	public CThostFtdcTradingNoticeField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 6, SequenceNo);
		return this;
	}
	/** C type : TThostFtdcContentType */
	@Array({501}) 
	@Field(7) 
	public Pointer<Byte > FieldContent() {
		return this.io.getPointerField(this, 7);
	}
	public CThostFtdcTradingNoticeField() {
		super();
	}
	public CThostFtdcTradingNoticeField(Pointer pointer) {
		super(pointer);
	}
}