package com.xceder.ctp.api.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdIP<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4565</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcLoginForbiddenIPField extends StructObject {
	/**
	 * IP\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(0) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 0);
	}
	public CThostFtdcLoginForbiddenIPField() {
		super();
	}
	public CThostFtdcLoginForbiddenIPField(Pointer pointer) {
		super(pointer);
	}
}
