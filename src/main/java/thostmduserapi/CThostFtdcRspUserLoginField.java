package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\u00fb\ufffd\ufffd\ufffd\u00bc\u04e6\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:43</i><br>
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
public class CThostFtdcRspUserLoginField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({ 9 })
	@Field(0)
	public Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 0);
	}

	/**
	 * \ufffd\ufffd\u00bc\ufffd\u0279\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(1)
	public Pointer<Byte> LoginTime() {
		return this.io.getPointerField(this, 1);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(2)
	public Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 2);
	}

	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({ 16 })
	@Field(3)
	public Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 3);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSystemNameType
	 */
	@Array({ 41 })
	@Field(4)
	public Pointer<Byte> SystemName() {
		return this.io.getPointerField(this, 4);
	}

	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5)
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}

	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5)
	public CThostFtdcRspUserLoginField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6)
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6)
	public CThostFtdcRspUserLoginField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}

	/**
	 * \ufffd\ufffd\udb86\ude35\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({ 13 })
	@Field(7)
	public Pointer<Byte> MaxOrderRef() {
		return this.io.getPointerField(this, 7);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(8)
	public Pointer<Byte> SHFETime() {
		return this.io.getPointerField(this, 8);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(9)
	public Pointer<Byte> DCETime() {
		return this.io.getPointerField(this, 9);
	}

	/**
	 * \u05a3\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(10)
	public Pointer<Byte> CZCETime() {
		return this.io.getPointerField(this, 10);
	}

	/**
	 * \ufffd\u043d\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(11)
	public Pointer<Byte> FFEXTime() {
		return this.io.getPointerField(this, 11);
	}

	public CThostFtdcRspUserLoginField() {
		super();
	}

	public CThostFtdcRspUserLoginField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
