package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u707e\u5907\u4ea4\u6613\u8f6c\u6362\u62a5\u6587<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcDRTransferField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDRIdentityIDType */
	@Field(0) 
	public int OrigDRIdentityID() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcDRIdentityIDType */
	@Field(0) 
	public CThostFtdcDRTransferField OrigDRIdentityID(int OrigDRIdentityID) {
		this.io.setIntField(this, 0, OrigDRIdentityID);
		return this;
	}
	/** C type : TThostFtdcDRIdentityIDType */
	@Field(1) 
	public int DestDRIdentityID() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcDRIdentityIDType */
	@Field(1) 
	public CThostFtdcDRTransferField DestDRIdentityID(int DestDRIdentityID) {
		this.io.setIntField(this, 1, DestDRIdentityID);
		return this;
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > OrigBrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > DestBrokerID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcDRTransferField() {
		super();
	}
	public CThostFtdcDRTransferField(Pointer pointer) {
		super(pointer);
	}
}