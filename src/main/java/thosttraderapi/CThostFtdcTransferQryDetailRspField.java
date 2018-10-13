package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u043d\ufffd\ufffd\ufffd\ufffd\ufffd\u03f8\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:267</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTransferQryDetailRspField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(2) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeSerialNoType
	 */
	@Field(3) 
	public int FutureSerial() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeSerialNoType
	 */
	@Field(3) 
	public CThostFtdcTransferQryDetailRspField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 3, FutureSerial);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureIDType
	 */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > FutureID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcFutureAccountType
	 */
	@Array({22}) 
	@Field(5) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeSerialNoType
	 */
	@Field(6) 
	public int BankSerial() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeSerialNoType
	 */
	@Field(6) 
	public CThostFtdcTransferQryDetailRspField BankSerial(int BankSerial) {
		this.io.setIntField(this, 6, BankSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0434\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(7) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(8) 
	public Pointer<Byte > BankBrchID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02fa\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(9) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCertCodeType
	 */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > CertCode() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\u04b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyCodeType
	 */
	@Array({4}) 
	@Field(11) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double TxAmount() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcTransferQryDetailRspField TxAmount(double TxAmount) {
		this.io.setDoubleField(this, 12, TxAmount);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcTransferValidFlagType
	 */
	@Field(13) 
	public byte Flag() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcTransferValidFlagType
	 */
	@Field(13) 
	public CThostFtdcTransferQryDetailRspField Flag(byte Flag) {
		this.io.setByteField(this, 13, Flag);
		return this;
	}
	public CThostFtdcTransferQryDetailRspField() {
		super();
	}
	public CThostFtdcTransferQryDetailRspField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
