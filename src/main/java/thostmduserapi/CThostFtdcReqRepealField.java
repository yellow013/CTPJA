package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:4290</i><br>
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
public class CThostFtdcReqRepealField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRepealTimeIntervalType
	 */
	@Field(0)
	public int RepealTimeInterval() {
		return this.io.getIntField(this, 0);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRepealTimeIntervalType
	 */
	@Field(0)
	public CThostFtdcReqRepealField RepealTimeInterval(int RepealTimeInterval) {
		this.io.setIntField(this, 0, RepealTimeInterval);
		return this;
	}

	/**
	 * \ufffd\u047e\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRepealedTimesType
	 */
	@Field(1)
	public int RepealedTimes() {
		return this.io.getIntField(this, 1);
	}

	/**
	 * \ufffd\u047e\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRepealedTimesType
	 */
	@Field(1)
	public CThostFtdcReqRepealField RepealedTimes(int RepealedTimes) {
		this.io.setIntField(this, 1, RepealedTimes);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0433\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBankRepealFlagType
	 */
	@Field(2)
	public byte BankRepealFlag() {
		return this.io.getByteField(this, 2);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0433\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBankRepealFlagType
	 */
	@Field(2)
	public CThostFtdcReqRepealField BankRepealFlag(byte BankRepealFlag) {
		this.io.setByteField(this, 2, BankRepealFlag);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0333\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBrokerRepealFlagType
	 */
	@Field(3)
	public byte BrokerRepealFlag() {
		return this.io.getByteField(this, 3);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0333\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBrokerRepealFlagType
	 */
	@Field(3)
	public CThostFtdcReqRepealField BrokerRepealFlag(byte BrokerRepealFlag) {
		this.io.setByteField(this, 3, BrokerRepealFlag);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcPlateSerialType
	 */
	@Field(4)
	public int PlateRepealSerial() {
		return this.io.getIntField(this, 4);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcPlateSerialType
	 */
	@Field(4)
	public CThostFtdcReqRepealField PlateRepealSerial(int PlateRepealSerial) {
		this.io.setIntField(this, 4, PlateRepealSerial);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({ 13 })
	@Field(5)
	public Pointer<Byte> BankRepealSerial() {
		return this.io.getPointerField(this, 5);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(6)
	public int FutureRepealSerial() {
		return this.io.getIntField(this, 6);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(6)
	public CThostFtdcReqRepealField FutureRepealSerial(int FutureRepealSerial) {
		this.io.setIntField(this, 6, FutureRepealSerial);
		return this;
	}

	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({ 7 })
	@Field(7)
	public Pointer<Byte> TradeCode() {
		return this.io.getPointerField(this, 7);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0434\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({ 4 })
	@Field(8)
	public Pointer<Byte> BankID() {
		return this.io.getPointerField(this, 8);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({ 5 })
	@Field(9)
	public Pointer<Byte> BankBranchID() {
		return this.io.getPointerField(this, 9);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0334\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(10)
	public Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 10);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0337\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({ 31 })
	@Field(11)
	public Pointer<Byte> BrokerBranchID() {
		return this.io.getPointerField(this, 11);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({ 9 })
	@Field(12)
	public Pointer<Byte> TradeDate() {
		return this.io.getPointerField(this, 12);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({ 9 })
	@Field(13)
	public Pointer<Byte> TradeTime() {
		return this.io.getPointerField(this, 13);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({ 13 })
	@Field(14)
	public Pointer<Byte> BankSerial() {
		return this.io.getPointerField(this, 14);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({ 9 })
	@Field(15)
	public Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 15);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(16)
	public int PlateSerial() {
		return this.io.getIntField(this, 16);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(16)
	public CThostFtdcReqRepealField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 16, PlateSerial);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(17)
	public byte LastFragment() {
		return this.io.getByteField(this, 17);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(17)
	public CThostFtdcReqRepealField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 17, LastFragment);
		return this;
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(18)
	public int SessionID() {
		return this.io.getIntField(this, 18);
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(18)
	public CThostFtdcReqRepealField SessionID(int SessionID) {
		this.io.setIntField(this, 18, SessionID);
		return this;
	}

	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({ 51 })
	@Field(19)
	public Pointer<Byte> CustomerName() {
		return this.io.getPointerField(this, 19);
	}

	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(20)
	public byte IdCardType() {
		return this.io.getByteField(this, 20);
	}

	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(20)
	public CThostFtdcReqRepealField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 20, IdCardType);
		return this;
	}

	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({ 51 })
	@Field(21)
	public Pointer<Byte> IdentifiedCardNo() {
		return this.io.getPointerField(this, 21);
	}

	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(22)
	public byte CustType() {
		return this.io.getByteField(this, 22);
	}

	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(22)
	public CThostFtdcReqRepealField CustType(byte CustType) {
		this.io.setByteField(this, 22, CustType);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({ 41 })
	@Field(23)
	public Pointer<Byte> BankAccount() {
		return this.io.getPointerField(this, 23);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({ 41 })
	@Field(24)
	public Pointer<Byte> BankPassWord() {
		return this.io.getPointerField(this, 24);
	}

	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({ 13 })
	@Field(25)
	public Pointer<Byte> AccountID() {
		return this.io.getPointerField(this, 25);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({ 41 })
	@Field(26)
	public Pointer<Byte> Password() {
		return this.io.getPointerField(this, 26);
	}

	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27)
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}

	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27)
	public CThostFtdcReqRepealField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(28)
	public int FutureSerial() {
		return this.io.getIntField(this, 28);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(28)
	public CThostFtdcReqRepealField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 28, FutureSerial);
		return this;
	}

	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\u02b6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({ 16 })
	@Field(29)
	public Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 29);
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(30)
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 30);
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(30)
	public CThostFtdcReqRepealField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 30, VerifyCertNoFlag);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({ 4 })
	@Field(31)
	public Pointer<Byte> CurrencyID() {
		return this.io.getPointerField(this, 31);
	}

	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(32)
	public double TradeAmount() {
		return this.io.getDoubleField(this, 32);
	}

	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(32)
	public CThostFtdcReqRepealField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 32, TradeAmount);
		return this;
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(33)
	public double FutureFetchAmount() {
		return this.io.getDoubleField(this, 33);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(33)
	public CThostFtdcReqRepealField FutureFetchAmount(double FutureFetchAmount) {
		this.io.setDoubleField(this, 33, FutureFetchAmount);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(34)
	public byte FeePayFlag() {
		return this.io.getByteField(this, 34);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(34)
	public CThostFtdcReqRepealField FeePayFlag(byte FeePayFlag) {
		this.io.setByteField(this, 34, FeePayFlag);
		return this;
	}

	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(35)
	public double CustFee() {
		return this.io.getDoubleField(this, 35);
	}

	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(35)
	public CThostFtdcReqRepealField CustFee(double CustFee) {
		this.io.setDoubleField(this, 35, CustFee);
		return this;
	}

	/**
	 * \u04e6\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(36)
	public double BrokerFee() {
		return this.io.getDoubleField(this, 36);
	}

	/**
	 * \u04e6\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(36)
	public CThostFtdcReqRepealField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 36, BrokerFee);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\u0577\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcAddInfoType
	 */
	@Array({ 129 })
	@Field(37)
	public Pointer<Byte> Message() {
		return this.io.getPointerField(this, 37);
	}

	/**
	 * \u056a\u04aa<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({ 36 })
	@Field(38)
	public Pointer<Byte> Digest() {
		return this.io.getPointerField(this, 38);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(39)
	public byte BankAccType() {
		return this.io.getByteField(this, 39);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(39)
	public CThostFtdcReqRepealField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 39, BankAccType);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({ 3 })
	@Field(40)
	public Pointer<Byte> DeviceID() {
		return this.io.getPointerField(this, 40);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(41)
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 41);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(41)
	public CThostFtdcReqRepealField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 41, BankSecuAccType);
		return this;
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\u0431\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({ 33 })
	@Field(42)
	public Pointer<Byte> BrokerIDByBank() {
		return this.io.getPointerField(this, 42);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({ 41 })
	@Field(43)
	public Pointer<Byte> BankSecuAcc() {
		return this.io.getPointerField(this, 43);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(44)
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 44);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(44)
	public CThostFtdcReqRepealField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 44, BankPwdFlag);
		return this;
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(45)
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 45);
	}

	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(45)
	public CThostFtdcReqRepealField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 45, SecuPwdFlag);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05f9\ufffd\u0531<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({ 17 })
	@Field(46)
	public Pointer<Byte> OperNo() {
		return this.io.getPointerField(this, 46);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(47)
	public int RequestID() {
		return this.io.getIntField(this, 47);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(47)
	public CThostFtdcReqRepealField RequestID(int RequestID) {
		this.io.setIntField(this, 47, RequestID);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(48)
	public int TID() {
		return this.io.getIntField(this, 48);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(48)
	public CThostFtdcReqRepealField TID(int TID) {
		this.io.setIntField(this, 48, TID);
		return this;
	}

	/**
	 * \u05ea\ufffd\u02fd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(49)
	public byte TransferStatus() {
		return this.io.getByteField(this, 49);
	}

	/**
	 * \u05ea\ufffd\u02fd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(49)
	public CThostFtdcReqRepealField TransferStatus(byte TransferStatus) {
		this.io.setByteField(this, 49, TransferStatus);
		return this;
	}

	public CThostFtdcReqRepealField() {
		super();
	}

	public CThostFtdcReqRepealField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
