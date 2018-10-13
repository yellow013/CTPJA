package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:241</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTransferQryBankRspField extends StructObject {
	/**
	 * \ufffd\ufffd\u04e6\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRetCodeType
	 */
	@Array({5}) 
	@Field(0) 
	public Pointer<Byte > RetCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\u04e6\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcRetInfoType
	 */
	@Array({129}) 
	@Field(1) 
	public Pointer<Byte > RetInfo() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double TradeAmt() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcTransferQryBankRspField TradeAmt(double TradeAmt) {
		this.io.setDoubleField(this, 3, TradeAmt);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u043f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double UseAmt() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\u043f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcTransferQryBankRspField UseAmt(double UseAmt) {
		this.io.setDoubleField(this, 4, UseAmt);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u043f\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double FetchAmt() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\u043f\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcTransferQryBankRspField FetchAmt(double FetchAmt) {
		this.io.setDoubleField(this, 5, FetchAmt);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyCodeType
	 */
	@Array({4}) 
	@Field(6) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcTransferQryBankRspField() {
		super();
	}
	public CThostFtdcTransferQryBankRspField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
