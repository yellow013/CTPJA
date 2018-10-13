package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

/**
 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:18</i><br>
 * This file was autogenerated by
 * <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that
 * <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a
 * few opensource projects.</a>.<br>
 * For help, please visit
 * <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or
 * <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi")
public class CThostFtdcMdSpi extends CPPObject {
	/**
	 * \ufffd\ufffd\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ubf7b\ufffd\u05fa\ufffd\u0328\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\u03b4\ufffd\ufffd\u00bc\u01f0\ufffd\ufffd\ufffd\ufffd\ufffd\u00f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00e1\ufffd<br>
	 * Original signature : <code>void OnFrontConnected()</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:22</i>
	 */
	@Virtual(0)
	native public void OnFrontConnected();

	/**
	 * 0x2003 \ufffd\u0575\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:31</i>
	 */
	@Virtual(1)
	native public void OnFrontDisconnected(int nReason);

	/**
	 * @param nTimeLapse
	 *            \ufffd\ufffd\ufffd\ufffd\ufffd\u03f4\u03bd\ufffd\ufffd\u0571\ufffd\ufffd\u0135\ufffd\u02b1\ufffd\ufffd<br>
	 *            Original signature : <code>void OnHeartBeatWarning(int)</code><br>
	 *            <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:35</i>
	 */
	@Virtual(2)
	native public void OnHeartBeatWarning(int nTimeLapse);

	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature :
	 * <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:39</i>
	 */
	@Virtual(3)
	native public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast); // {
	// OnRspUserLogin(Pointer.getPeer(pRspUserLogin), Pointer.getPeer(pRspInfo),
	// nRequestID, bIsLast);
	// }
	// @Virtual(3)
	// protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long
	// pRspInfo, int nRequestID, boolean bIsLast);

	/**
	 * \ufffd\u01f3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature :
	 * <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:42</i>
	 */
	@Virtual(4)
	native public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast); // {
	// OnRspUserLogout(Pointer.getPeer(pUserLogout), Pointer.getPeer(pRspInfo),
	// nRequestID, bIsLast);
	// }
	// @Virtual(4)
	// protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long
	// pRspInfo, int nRequestID, boolean bIsLast);

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature :
	 * <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:45</i>
	 */
	@Virtual(5)
	native public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast); // {
	// OnRspError(Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	// }
	// @Virtual(5)
	// protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean
	// bIsLast);

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature :
	 * <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:48</i>
	 */
	@Virtual(6)
	native public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast); // {
	// OnRspSubMarketData(Pointer.getPeer(pSpecificInstrument),
	// Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	// }
	// @Virtual(6)
	// protected native void OnRspSubMarketData(@Ptr long pSpecificInstrument, @Ptr
	// long pRspInfo, int nRequestID, boolean bIsLast);

	/**
	 * \u0221\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature :
	 * <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:51</i>
	 */
	@Virtual(7)
	native public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast); // {
	// OnRspUnSubMarketData(Pointer.getPeer(pSpecificInstrument),
	// Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	// }
	// @Virtual(7)
	// protected native void OnRspUnSubMarketData(@Ptr long pSpecificInstrument,
	// @Ptr long pRspInfo, int nRequestID, boolean bIsLast);

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature :
	 * <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcMdApi.h:54</i>
	 */
	@Virtual(8)
	native public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData);// {
	// OnRtnDepthMarketData(Pointer.getPeer(pDepthMarketData));
	// }
	// @Virtual(8)
	// protected native void OnRtnDepthMarketData(@Ptr long pDepthMarketData);

	public CThostFtdcMdSpi() {
		super();
	}

	public CThostFtdcMdSpi(Pointer<? extends CPPObject> pointer) {
		super(pointer);
	}
}
