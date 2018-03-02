package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcMdSpi extends CPPObject {
	static {
		BridJ.register();
	}
	/** Original signature : <code>void OnFrontConnected()</code> */
	@Virtual(0) 
	public native void OnFrontConnected();
	/** Original signature : <code>void OnFrontDisconnected(int)</code> */
	@Virtual(1) 
	public native void OnFrontDisconnected(int nReason);
	/** Original signature : <code>void OnHeartBeatWarning(int)</code> */
	@Virtual(2) 
	public native void OnHeartBeatWarning(int nTimeLapse);
	/** Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(3) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogin(Pointer.getPeer(pRspUserLogin), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(3) 
	protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(4) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogout(Pointer.getPeer(pUserLogout), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(4) 
	protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(5) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspError(Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(5) 
	protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(6) 
	public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(6) 
	protected native void OnRspSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(7) 
	public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(7) 
	protected native void OnRspUnSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(8) 
	public void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(8) 
	protected native void OnRspSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code> */
	@Virtual(9) 
	public void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(9) 
	protected native void OnRspUnSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/** Original signature : <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code> */
	@Virtual(10) 
	public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData) {
		OnRtnDepthMarketData(Pointer.getPeer(pDepthMarketData));
	}
	@Virtual(10) 
	protected native void OnRtnDepthMarketData(@Ptr long pDepthMarketData);
	/** Original signature : <code>void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code> */
	@Virtual(11) 
	public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp) {
		OnRtnForQuoteRsp(Pointer.getPeer(pForQuoteRsp));
	}
	@Virtual(11) 
	protected native void OnRtnForQuoteRsp(@Ptr long pForQuoteRsp);
	public CThostFtdcMdSpi() {
		super();
	}
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}