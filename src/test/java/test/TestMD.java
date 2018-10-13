package test;

import org.bridj.BridJ;
import org.bridj.Pointer;

import thostmduserapi.CThostFtdcMdApi;
import thostmduserapi.CThostFtdcMdSpi;
import thosttraderapi.CThostFtdcTraderApi;
import thosttraderapi.CThostFtdcTraderSpi;

/**
 * Copyright (c) 2011-2013, z16304607@163.com Created with IntelliJ IDEA. User:
 * trade Date: 13-4-10 Time: 下午3:50 To change this template use File | Settings
 * | File Templates.
 */
public class TestMD {
	@SuppressWarnings("deprecation")
	public static void main(String[] argv) {
		System.out.println("Start TestMD------------------------");

		BridJ.register(CThostFtdcMdApi.class); // 必须的
		BridJ.register(CThostFtdcTraderApi.class); // 必须的

		Pointer<CThostFtdcMdApi> PointerThostFtdcMdApi = CThostFtdcMdApi.CreateFtdcMdApi(Pointer.pointerToCString(""),
				false);
		CThostFtdcMdApi ftdcMdApi = PointerThostFtdcMdApi.get();

		// ======================================================================================================================================================
		// test
		Pointer<CThostFtdcTraderApi> PointerThostFtdcTraderApi = CThostFtdcTraderApi
				.CreateFtdcTraderApi(Pointer.pointerToCString(""), false);
		CThostFtdcTraderApi ftdcTraderApi = PointerThostFtdcTraderApi.get();

		/**
		 * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object
		 * getJavaObjectFromNativePeer(long peer) { 获取不到strongNativeObjects的对应对象。
		 */
		BridJ.protectFromGC(ftdcTraderApi); // 必须的
		CThostFtdcTraderSpi tradeSpi = new TestTradeSpi(ftdcTraderApi);

		/*
		 * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object
		 * getJavaObjectFromNativePeer(long peer) { 获取不到strongNativeObjects的对应对象。
		 */
		BridJ.protectFromGC(tradeSpi); // 必须的
		ftdcTraderApi.RegisterSpi(Pointer.pointerTo(tradeSpi));

		ftdcTraderApi.RegisterFront(Pointer.pointerToCString("tcp://222.66.235.70:61205")); // 申万期货
		ftdcTraderApi.Init();
		// =======================================================================================================================================================

		/**
		 * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object
		 * getJavaObjectFromNativePeer(long peer) { 获取不到strongNativeObjects的对应对象。
		 */
		BridJ.protectFromGC(ftdcMdApi); // 必须的

		CThostFtdcMdSpi mdSpi = new TestMdSpi(ftdcMdApi);

		/**
		 * 如果不加入这段代码，会导致 iridJ类中的public static synchronized Object
		 * getJavaObjectFromNativePeer(long peer) { 获取不到strongNativeObjects的对应对象。
		 */
		BridJ.protectFromGC(mdSpi); // 必须的

		ftdcMdApi.RegisterSpi(Pointer.pointerTo(mdSpi));

		ftdcMdApi.RegisterFront(Pointer.pointerToCString("tcp://sim-md1.ctp.shcifco.com:31213"));
		ftdcMdApi.Init();

		ftdcMdApi.Join();

		System.out.println("End TestMD------------------------");
	}
}
