package thosttraderapi;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import thosttraderapi.ThosttraderapiLibrary.THOST_TE_RESUME_TYPE;
/**
 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:249</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTraderApi extends CPPObject {
	/**
	 * modify for udp marketdata<br>
	 * Original signature : <code>CThostFtdcTraderApi* CreateFtdcTraderApi(const char*, const bool)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:256</i>
	 */
	native public static Pointer<CThostFtdcTraderApi > CreateFtdcTraderApi(Pointer<Byte > pszFlowPath, boolean bIsUsingUdp) ; // {
	//	return Pointer.pointerToAddress(CreateFtdcTraderApi(Pointer.getPeer(pszFlowPath), bIsUsingUdp), CThostFtdcTraderApi.class);
	//}
	//@Ptr
	//protected native static long CreateFtdcTraderApi(@Ptr long pszFlowPath, boolean bIsUsingUdp);
	/**
	 * @remark \ufffd\ufffd\ufffd\ufffd\u02b9\ufffd\u00f1\ufffd\ufffd\u04ff\u06b6\ufffd\ufffd\ufffd\u02b1,\ufffd\ufffd\ufffd\u00f8\u00fa\ufffd\ufffd\ufffd\u027e\ufffd\ufffd\u04ff\u06b6\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>void Release()</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:260</i>
	 */
	@Virtual(0) 
	native public void Release();
	/**
	 * @remark \ufffd\ufffd\u02bc\ufffd\ufffd\ufffd\ufffd\ufffd\u043b\ufffd\ufffd\ufffd,\u05bb\ufffd\u0435\ufffd\ufffd\u00fa\ufffd,\ufffd\u04ff\u06b2\u017f\ufffd\u02bc\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>void Init()</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:264</i>
	 */
	@Virtual(1) 
	native public void Init();
	/**
	 * @return \ufffd\u07f3\ufffd\ufffd\u02f3\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int Join()</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:268</i>
	 */
	@Virtual(2) 
	native public int Join();
	/**
	 * @remark \u05bb\ufffd\u0435\ufffd\u00bc\ufffd\u0279\ufffd\ufffd\ufffd,\ufffd\ufffd\ufffd\u0735\u00f5\ufffd\ufffd\ufffd\u0237\ufffd\u013d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>char* GetTradingDay()</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:273</i>
	 */
	@Virtual(3) 
	native public Pointer<Byte > GetTradingDay( ) ; // {
	//	return Pointer.pointerToAddress(GetTradingDay$2(), Byte.class);
	//}
	//@Ptr
	//@Name("GetTradingDay")
	//@Virtual(3)
	//protected native long GetTradingDay$2();
	/**
	 * @remark \ufffd\ufffdtcp\ufffd\ufffd\ufffd\ufffd\udd2b\ufffd\ufffd\u042d\ufffd\u98ec\ufffd\ufffd127.0.0.1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05b7\ufffd\ufffd\ufffd\ufffd17001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ff\u06ba\u0161\ufffd<br>
	 * Original signature : <code>void RegisterFront(char*)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:279</i>
	 */
	@Virtual(4) 
	native public void RegisterFront(Pointer<Byte > pszFrontAddress) ; // {
	//	RegisterFront(Pointer.getPeer(pszFrontAddress));
	//}
	//@Virtual(4)
	//protected native void RegisterFront(@Ptr long pszFrontAddress);
	/**
	 * @remark RegisterNameServer\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdRegisterFront<br>
	 * Original signature : <code>void RegisterNameServer(char*)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:286</i>
	 */
	@Virtual(5) 
	native public void RegisterNameServer(Pointer<Byte > pszNsAddress) ; // {
	//	RegisterNameServer(Pointer.getPeer(pszNsAddress));
	//}
	//@Virtual(5)
	//protected native void RegisterNameServer(@Ptr long pszNsAddress);
	/**
	 * @param pSpi \ufffd\ufffd\ufffd\ufffd\ufffd\u053b\u0635\ufffd\ufffd\u04ff\ufffd\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd<br>
	 * Original signature : <code>void RegisterSpi(CThostFtdcTraderSpi*)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:290</i>
	 */
	@Virtual(6) 
	native public void RegisterSpi(Pointer<CThostFtdcTraderSpi > pSpi) ; // {
	//	RegisterSpi(Pointer.getPeer(pSpi));
	//}
	//@Virtual(6)
	//protected native void RegisterSpi(@Ptr long pSpi);
	/**
	 * @remark \ufffd\u00f7\ufffd\ufffd\ufffd\u04aa\ufffd\ufffdInit\ufffd\ufffd\ufffd\ufffd\u01f0\ufffd\ufffd\ufffd\u00e1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uda8b\udefb\ufffd\ufffd\u0575\ufffd\u02fd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0761\ufffd<br>
	 * Original signature : <code>void SubscribePrivateTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:298</i>
	 */
	@Virtual(7) 
	native public void SubscribePrivateTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) ; // {
	//	SubscribePrivateTopic((int)nResumeType.value());
	//}
	//@Virtual(7)
	//protected native void SubscribePrivateTopic(int nResumeType);
	/**
	 * @remark \ufffd\u00f7\ufffd\ufffd\ufffd\u04aa\ufffd\ufffdInit\ufffd\ufffd\ufffd\ufffd\u01f0\ufffd\ufffd\ufffd\u00e1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uda8b\udefb\ufffd\ufffd\u0575\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0761\ufffd<br>
	 * Original signature : <code>void SubscribePublicTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:306</i>
	 */
	@Virtual(8) 
	native public void SubscribePublicTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) ; // {
	//	SubscribePublicTopic((int)nResumeType.value());
	//}
	//@Virtual(8)
	//protected native void SubscribePublicTopic(int nResumeType);
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqAuthenticate(CThostFtdcReqAuthenticateField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:309</i>
	 */
	@Virtual(9) 
	native public int ReqAuthenticate(Pointer<CThostFtdcReqAuthenticateField > pReqAuthenticateField, int nRequestID) ; // {
	//	return ReqAuthenticate(Pointer.getPeer(pReqAuthenticateField), nRequestID);
	//}
	//@Virtual(9)
	//protected native int ReqAuthenticate(@Ptr long pReqAuthenticateField, int nRequestID);
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqUserLogin(CThostFtdcReqUserLoginField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:312</i>
	 */
	@Virtual(10) 
	native public int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField > pReqUserLoginField, int nRequestID) ; // {
	//	return ReqUserLogin(Pointer.getPeer(pReqUserLoginField), nRequestID);
	//}
	//@Virtual(10)
	//protected native int ReqUserLogin(@Ptr long pReqUserLoginField, int nRequestID);
	/**
	 * \ufffd\u01f3\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqUserLogout(CThostFtdcUserLogoutField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:316</i>
	 */
	@Virtual(11) 
	native public int ReqUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, int nRequestID) ; // {
	//	return ReqUserLogout(Pointer.getPeer(pUserLogout), nRequestID);
	//}
	//@Virtual(11)
	//protected native int ReqUserLogout(@Ptr long pUserLogout, int nRequestID);
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:319</i>
	 */
	@Virtual(12) 
	native public int ReqUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField > pUserPasswordUpdate, int nRequestID) ; // {
	//	return ReqUserPasswordUpdate(Pointer.getPeer(pUserPasswordUpdate), nRequestID);
	//}
	//@Virtual(12)
	//protected native int ReqUserPasswordUpdate(@Ptr long pUserPasswordUpdate, int nRequestID);
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:322</i>
	 */
	@Virtual(13) 
	native public int ReqTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField > pTradingAccountPasswordUpdate, int nRequestID) ; // {
	//	return ReqTradingAccountPasswordUpdate(Pointer.getPeer(pTradingAccountPasswordUpdate), nRequestID);
	//}
	//@Virtual(13)
	//protected native int ReqTradingAccountPasswordUpdate(@Ptr long pTradingAccountPasswordUpdate, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqOrderInsert(CThostFtdcInputOrderField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:325</i>
	 */
	@Virtual(14) 
	native public int ReqOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, int nRequestID) ; // {
	//	return ReqOrderInsert(Pointer.getPeer(pInputOrder), nRequestID);
	//}
	//@Virtual(14)
	//protected native int ReqOrderInsert(@Ptr long pInputOrder, int nRequestID);
	/**
	 * \u0524\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqParkedOrderInsert(CThostFtdcParkedOrderField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:328</i>
	 */
	@Virtual(15) 
	native public int ReqParkedOrderInsert(Pointer<CThostFtdcParkedOrderField > pParkedOrder, int nRequestID) ; //{
	//	return ReqParkedOrderInsert(Pointer.getPeer(pParkedOrder), nRequestID);
	//}
	//@Virtual(15)
	//protected native int ReqParkedOrderInsert(@Ptr long pParkedOrder, int nRequestID);
	/**
	 * \u0524\ufffd\ud98f\uddf5\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqParkedOrderAction(CThostFtdcParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:331</i>
	 */
	@Virtual(16) 
	native public int ReqParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, int nRequestID) ; // {
	//	return ReqParkedOrderAction(Pointer.getPeer(pParkedOrderAction), nRequestID);
	//}
	//@Virtual(16)
	//protected native int ReqParkedOrderAction(@Ptr long pParkedOrderAction, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqOrderAction(CThostFtdcInputOrderActionField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:334</i>
	 */
	@Virtual(17) 
	native public int ReqOrderAction(Pointer<CThostFtdcInputOrderActionField > pInputOrderAction, int nRequestID) ; // {
	//	return ReqOrderAction(Pointer.getPeer(pInputOrderAction), nRequestID);
	//}
	//@Virtual(17)
	//protected native int ReqOrderAction(@Ptr long pInputOrderAction, int nRequestID);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\udb86\ude35\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:337</i>
	 */
	@Virtual(18) 
	native public int ReqQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField > pQueryMaxOrderVolume, int nRequestID) ; // {
	//	return ReqQueryMaxOrderVolume(Pointer.getPeer(pQueryMaxOrderVolume), nRequestID);
	//}
	//@Virtual(18)
	//protected native int ReqQueryMaxOrderVolume(@Ptr long pQueryMaxOrderVolume, int nRequestID);
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\ufffd\ufffd\ufffd\u0237\ufffd\ufffd<br>
	 * Original signature : <code>int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:340</i>
	 */
	@Virtual(19) 
	native public int ReqSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, int nRequestID) ; // {
	//	return ReqSettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), nRequestID);
	//}
	//@Virtual(19)
	//protected native int ReqSettlementInfoConfirm(@Ptr long pSettlementInfoConfirm, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u027e\ufffd\ufffd\u0524\ufffd\ufffd<br>
	 * Original signature : <code>int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:343</i>
	 */
	@Virtual(20) 
	native public int ReqRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField > pRemoveParkedOrder, int nRequestID) ; // {
	//	return ReqRemoveParkedOrder(Pointer.getPeer(pRemoveParkedOrder), nRequestID);
	//}
	//@Virtual(20)
	//protected native int ReqRemoveParkedOrder(@Ptr long pRemoveParkedOrder, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u027e\ufffd\ufffd\u0524\ufffd\ud98f\uddf5\ufffd<br>
	 * Original signature : <code>int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:346</i>
	 */
	@Virtual(21) 
	native public int ReqRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField > pRemoveParkedOrderAction, int nRequestID) ; // {
	//	return ReqRemoveParkedOrderAction(Pointer.getPeer(pRemoveParkedOrderAction), nRequestID);
	//}
	//@Virtual(21)
	//protected native int ReqRemoveParkedOrderAction(@Ptr long pRemoveParkedOrderAction, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryOrder(CThostFtdcQryOrderField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:349</i>
	 */
	@Virtual(22) 
	native public int ReqQryOrder(Pointer<CThostFtdcQryOrderField > pQryOrder, int nRequestID) ; // {
	//	return ReqQryOrder(Pointer.getPeer(pQryOrder), nRequestID);
	//}
	//@Virtual(22)
	//protected native int ReqQryOrder(@Ptr long pQryOrder, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u027d\ufffd<br>
	 * Original signature : <code>int ReqQryTrade(CThostFtdcQryTradeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:352</i>
	 */
	@Virtual(23) 
	native public int ReqQryTrade(Pointer<CThostFtdcQryTradeField > pQryTrade, int nRequestID) ; // {
	//	return ReqQryTrade(Pointer.getPeer(pQryTrade), nRequestID);
	//}
	//@Virtual(23)
	//protected native int ReqQryTrade(@Ptr long pQryTrade, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0376\ufffd\ufffd\ufffd\u07f3\u05b2\ufffd<br>
	 * Original signature : <code>int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:355</i>
	 */
	@Virtual(24) 
	native public int ReqQryInvestorPosition(Pointer<CThostFtdcQryInvestorPositionField > pQryInvestorPosition, int nRequestID) ; // {
	//	return ReqQryInvestorPosition(Pointer.getPeer(pQryInvestorPosition), nRequestID);
	//}
	//@Virtual(24)
	//protected native int ReqQryInvestorPosition(@Ptr long pQryInvestorPosition, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u02bd\ufffd\ufffd\u02fb\ufffd<br>
	 * Original signature : <code>int ReqQryTradingAccount(CThostFtdcQryTradingAccountField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:358</i>
	 */
	@Virtual(25) 
	native public int ReqQryTradingAccount(Pointer<CThostFtdcQryTradingAccountField > pQryTradingAccount, int nRequestID) ; // {
	//	return ReqQryTradingAccount(Pointer.getPeer(pQryTradingAccount), nRequestID);
	//}
	//@Virtual(25)
	//protected native int ReqQryTradingAccount(@Ptr long pQryTradingAccount, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0376\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryInvestor(CThostFtdcQryInvestorField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:361</i>
	 */
	@Virtual(26) 
	native public int ReqQryInvestor(Pointer<CThostFtdcQryInvestorField > pQryInvestor, int nRequestID) ; // {
	//	return ReqQryInvestor(Pointer.getPeer(pQryInvestor), nRequestID);
	//}
	//@Virtual(26)
	//protected native int ReqQryInvestor(@Ptr long pQryInvestor, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryTradingCode(CThostFtdcQryTradingCodeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:364</i>
	 */
	@Virtual(27) 
	native public int ReqQryTradingCode(Pointer<CThostFtdcQryTradingCodeField > pQryTradingCode, int nRequestID) ; // {
	//	return ReqQryTradingCode(Pointer.getPeer(pQryTradingCode), nRequestID);
	//}
	//@Virtual(27)
	//protected native int ReqQryTradingCode(@Ptr long pQryTradingCode, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:367</i>
	 */
	@Virtual(28) 
	native public int ReqQryInstrumentMarginRate(Pointer<CThostFtdcQryInstrumentMarginRateField > pQryInstrumentMarginRate, int nRequestID) ; // {
	//	return ReqQryInstrumentMarginRate(Pointer.getPeer(pQryInstrumentMarginRate), nRequestID);
	//}
	//@Virtual(28)
	//protected native int ReqQryInstrumentMarginRate(@Ptr long pQryInstrumentMarginRate, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:370</i>
	 */
	@Virtual(29) 
	native public int ReqQryInstrumentCommissionRate(Pointer<CThostFtdcQryInstrumentCommissionRateField > pQryInstrumentCommissionRate, int nRequestID) ; // {
	//	return ReqQryInstrumentCommissionRate(Pointer.getPeer(pQryInstrumentCommissionRate), nRequestID);
	//}
	//@Virtual(29)
	//protected native int ReqQryInstrumentCommissionRate(@Ptr long pQryInstrumentCommissionRate, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryExchange(CThostFtdcQryExchangeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:373</i>
	 */
	@Virtual(30) 
	native public int ReqQryExchange(Pointer<CThostFtdcQryExchangeField > pQryExchange, int nRequestID) ; // {
	//	return ReqQryExchange(Pointer.getPeer(pQryExchange), nRequestID);
	//}
	//@Virtual(30)
	//protected native int ReqQryExchange(@Ptr long pQryExchange, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u053c<br>
	 * Original signature : <code>int ReqQryInstrument(CThostFtdcQryInstrumentField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:376</i>
	 */
	@Virtual(31) 
	native public int ReqQryInstrument(Pointer<CThostFtdcQryInstrumentField > pQryInstrument, int nRequestID) ; // {
	//	return ReqQryInstrument(Pointer.getPeer(pQryInstrument), nRequestID);
	//}
	//@Virtual(31)
	//protected native int ReqQryInstrument(@Ptr long pQryInstrument, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:379</i>
	 */
	@Virtual(32) 
	native public int ReqQryDepthMarketData(Pointer<CThostFtdcQryDepthMarketDataField > pQryDepthMarketData, int nRequestID) ; // {
	//	return ReqQryDepthMarketData(Pointer.getPeer(pQryDepthMarketData), nRequestID);
	//}
	//@Virtual(32)
	//protected native int ReqQryDepthMarketData(@Ptr long pQryDepthMarketData, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0376\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:382</i>
	 */
	@Virtual(33) 
	native public int ReqQrySettlementInfo(Pointer<CThostFtdcQrySettlementInfoField > pQrySettlementInfo, int nRequestID) ; // {
	//	return ReqQrySettlementInfo(Pointer.getPeer(pQrySettlementInfo), nRequestID);
	//}
	//@Virtual(33)
	//protected native int ReqQrySettlementInfo(@Ptr long pQrySettlementInfo, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryTransferBank(CThostFtdcQryTransferBankField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:385</i>
	 */
	@Virtual(34) 
	native public int ReqQryTransferBank(Pointer<CThostFtdcQryTransferBankField > pQryTransferBank, int nRequestID) ; // {
	//	return ReqQryTransferBank(Pointer.getPeer(pQryTransferBank), nRequestID);
	//}
	//@Virtual(34)
	//protected native int ReqQryTransferBank(@Ptr long pQryTransferBank, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0376\ufffd\ufffd\ufffd\u07f3\u05b2\ufffd\ufffd\ufffd\u03f8<br>
	 * Original signature : <code>int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:388</i>
	 */
	@Virtual(35) 
	native public int ReqQryInvestorPositionDetail(Pointer<CThostFtdcQryInvestorPositionDetailField > pQryInvestorPositionDetail, int nRequestID) ; // {
	//	return ReqQryInvestorPositionDetail(Pointer.getPeer(pQryInvestorPositionDetail), nRequestID);
	//}
	//@Virtual(35)
	//protected native int ReqQryInvestorPositionDetail(@Ptr long pQryInvestorPositionDetail, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u037b\ufffd\u0368\u05aa<br>
	 * Original signature : <code>int ReqQryNotice(CThostFtdcQryNoticeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:391</i>
	 */
	@Virtual(36) 
	native public int ReqQryNotice(Pointer<CThostFtdcQryNoticeField > pQryNotice, int nRequestID) ; // {
	//	return ReqQryNotice(Pointer.getPeer(pQryNotice), nRequestID);
	//}
	//@Virtual(36)
	//protected native int ReqQryNotice(@Ptr long pQryNotice, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2\u0237\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:394</i>
	 */
	@Virtual(37) 
	native public int ReqQrySettlementInfoConfirm(Pointer<CThostFtdcQrySettlementInfoConfirmField > pQrySettlementInfoConfirm, int nRequestID) ; // {
	//	return ReqQrySettlementInfoConfirm(Pointer.getPeer(pQrySettlementInfoConfirm), nRequestID);
	//}
	//@Virtual(37)
	//protected native int ReqQrySettlementInfoConfirm(@Ptr long pQrySettlementInfoConfirm, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0376\ufffd\ufffd\ufffd\u07f3\u05b2\ufffd\ufffd\ufffd\u03f8<br>
	 * Original signature : <code>int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:397</i>
	 */
	@Virtual(38) 
	native public int ReqQryInvestorPositionCombineDetail(Pointer<CThostFtdcQryInvestorPositionCombineDetailField > pQryInvestorPositionCombineDetail, int nRequestID) ; // {
	//	return ReqQryInvestorPositionCombineDetail(Pointer.getPeer(pQryInvestorPositionCombineDetail), nRequestID);
	//}
	//@Virtual(38)
	//protected native int ReqQryInvestorPositionCombineDetail(@Ptr long pQryInvestorPositionCombineDetail, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\ufffd\ufffd\u053f<br>
	 * Original signature : <code>int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:400</i>
	 */
	@Virtual(39) 
	native public int ReqQryCFMMCTradingAccountKey(Pointer<CThostFtdcQryCFMMCTradingAccountKeyField > pQryCFMMCTradingAccountKey, int nRequestID) ; // {
	//	return ReqQryCFMMCTradingAccountKey(Pointer.getPeer(pQryCFMMCTradingAccountKey), nRequestID);
	//}
	//@Virtual(39)
	//protected native int ReqQryCFMMCTradingAccountKey(@Ptr long pQryCFMMCTradingAccountKey, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u05b5\ufffd\ufffd\u06f5\ufffd\ufffd\ufffd\u03e2<br>
	 * Original signature : <code>int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:403</i>
	 */
	@Virtual(40) 
	native public int ReqQryEWarrantOffset(Pointer<CThostFtdcQryEWarrantOffsetField > pQryEWarrantOffset, int nRequestID) ; // {
	//	return ReqQryEWarrantOffset(Pointer.getPeer(pQryEWarrantOffset), nRequestID);
    //}
	//@Virtual(40)
	//protected native int ReqQryEWarrantOffset(@Ptr long pQryEWarrantOffset, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u05ea\ufffd\ufffd\ufffd\ufffd\u02ee<br>
	 * Original signature : <code>int ReqQryTransferSerial(CThostFtdcQryTransferSerialField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:406</i>
	 */
	@Virtual(41) 
	native public int ReqQryTransferSerial(Pointer<CThostFtdcQryTransferSerialField > pQryTransferSerial, int nRequestID) ; // {
	//	return ReqQryTransferSerial(Pointer.getPeer(pQryTransferSerial), nRequestID);
	//}
	//@Virtual(41)
	//protected native int ReqQryTransferSerial(@Ptr long pQryTransferSerial, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u01e9\u053c\ufffd\ufffd\u03f5<br>
	 * Original signature : <code>int ReqQryAccountregister(CThostFtdcQryAccountregisterField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:409</i>
	 */
	@Virtual(42) 
	native public int ReqQryAccountregister(Pointer<CThostFtdcQryAccountregisterField > pQryAccountregister, int nRequestID) ; // {
	//	return ReqQryAccountregister(Pointer.getPeer(pQryAccountregister), nRequestID);
	//}
	//@Virtual(42)
	//protected native int ReqQryAccountregister(@Ptr long pQryAccountregister, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u01e9\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryContractBank(CThostFtdcQryContractBankField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:412</i>
	 */
	@Virtual(43) 
	native public int ReqQryContractBank(Pointer<CThostFtdcQryContractBankField > pQryContractBank, int nRequestID) ; // {
	//	return ReqQryContractBank(Pointer.getPeer(pQryContractBank), nRequestID);
	//}
	//@Virtual(43)
	//protected native int ReqQryContractBank(@Ptr long pQryContractBank, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0524\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryParkedOrder(CThostFtdcQryParkedOrderField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:415</i>
	 */
	@Virtual(44) 
	native public int ReqQryParkedOrder(Pointer<CThostFtdcQryParkedOrderField > pQryParkedOrder, int nRequestID) ; // {
	//	return ReqQryParkedOrder(Pointer.getPeer(pQryParkedOrder), nRequestID);
	//}
	//@Virtual(44)
	//protected native int ReqQryParkedOrder(@Ptr long pQryParkedOrder, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u0524\ufffd\ud98f\uddf5\ufffd<br>
	 * Original signature : <code>int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:418</i>
	 */
	@Virtual(45) 
	native public int ReqQryParkedOrderAction(Pointer<CThostFtdcQryParkedOrderActionField > pQryParkedOrderAction, int nRequestID) ; // {
	//	return ReqQryParkedOrderAction(Pointer.getPeer(pQryParkedOrderAction), nRequestID);
	//}
	//@Virtual(45)
	//protected native int ReqQryParkedOrderAction(@Ptr long pQryParkedOrderAction, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:421</i>
	 */
	@Virtual(46) 
	native public int ReqQryTradingNotice(Pointer<CThostFtdcQryTradingNoticeField > pQryTradingNotice, int nRequestID) ; // {
	//	return ReqQryTradingNotice(Pointer.getPeer(pQryTradingNotice), nRequestID);
	//}
	//@Virtual(46)
	//protected native int ReqQryTradingNotice(@Ptr long pQryTradingNotice, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u05f2\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:424</i>
	 */
	@Virtual(47) 
	native public int ReqQryBrokerTradingParams(Pointer<CThostFtdcQryBrokerTradingParamsField > pQryBrokerTradingParams, int nRequestID) ; // {
	//	return ReqQryBrokerTradingParams(Pointer.getPeer(pQryBrokerTradingParams), nRequestID);
	//}
	//@Virtual(47)
	//protected native int ReqQryBrokerTradingParams(@Ptr long pQryBrokerTradingParams, int nRequestID);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\u3de8<br>
	 * Original signature : <code>int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:427</i>
	 */
	@Virtual(48) 
	native public int ReqQryBrokerTradingAlgos(Pointer<CThostFtdcQryBrokerTradingAlgosField > pQryBrokerTradingAlgos, int nRequestID) ; // {
	//	return ReqQryBrokerTradingAlgos(Pointer.getPeer(pQryBrokerTradingAlgos), nRequestID);
	//}
	//@Virtual(48)
	//protected native int ReqQryBrokerTradingAlgos(@Ptr long pQryBrokerTradingAlgos, int nRequestID);
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\u05ea\ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:430</i>
	 */
	@Virtual(49) 
	native public int ReqFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) ; // {
	//	return ReqFromBankToFutureByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	//}
	//@Virtual(49)
	//protected native int ReqFromBankToFutureByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:433</i>
	 */
	@Virtual(50) 
	native public int ReqFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) ; // {
	//	return ReqFromFutureToBankByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	//}
	//@Virtual(50)
	//protected native int ReqFromFutureToBankByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField*, int)</code><br>
	 * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:436</i>
	 */
	@Virtual(51) 
	native public int ReqQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, int nRequestID) ; // {
	//	return ReqQueryBankAccountMoneyByFuture(Pointer.getPeer(pReqQueryAccount), nRequestID);
	//}
	//@Virtual(51)
	//protected native int ReqQueryBankAccountMoneyByFuture(@Ptr long pReqQueryAccount, int nRequestID);
	public CThostFtdcTraderApi() {
		super();
	}
	public CThostFtdcTraderApi(Pointer<? extends CPPObject> pointer) {
		super(pointer);
	}
}
