package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\ufffd\ufffd\udb86\ude35\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:3483</i><br>
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
public class CThostFtdcErrOrderActionField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(0)
	public Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 0);
	}

	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({ 13 })
	@Field(1)
	public Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2)
	public int OrderActionRef() {
		return this.io.getIntField(this, 2);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2)
	public CThostFtdcErrOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({ 13 })
	@Field(3)
	public Pointer<Byte> OrderRef() {
		return this.io.getPointerField(this, 3);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4)
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4)
	public CThostFtdcErrOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
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
	public CThostFtdcErrOrderActionField FrontID(int FrontID) {
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
	public CThostFtdcErrOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({ 9 })
	@Field(7)
	public Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 7);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({ 21 })
	@Field(8)
	public Pointer<Byte> OrderSysID() {
		return this.io.getPointerField(this, 8);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9)
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9)
	public CThostFtdcErrOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}

	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10)
	public double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}

	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10)
	public CThostFtdcErrOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11)
	public int VolumeChange() {
		return this.io.getIntField(this, 11);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11)
	public CThostFtdcErrOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 11, VolumeChange);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({ 9 })
	@Field(12)
	public Pointer<Byte> ActionDate() {
		return this.io.getPointerField(this, 12);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({ 9 })
	@Field(13)
	public Pointer<Byte> ActionTime() {
		return this.io.getPointerField(this, 13);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({ 21 })
	@Field(14)
	public Pointer<Byte> TraderID() {
		return this.io.getPointerField(this, 14);
	}

	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15)
	public int InstallID() {
		return this.io.getIntField(this, 15);
	}

	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15)
	public CThostFtdcErrOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 15, InstallID);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({ 13 })
	@Field(16)
	public Pointer<Byte> OrderLocalID() {
		return this.io.getPointerField(this, 16);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0631\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({ 13 })
	@Field(17)
	public Pointer<Byte> ActionLocalID() {
		return this.io.getPointerField(this, 17);
	}

	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({ 11 })
	@Field(18)
	public Pointer<Byte> ParticipantID() {
		return this.io.getPointerField(this, 18);
	}

	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({ 11 })
	@Field(19)
	public Pointer<Byte> ClientID() {
		return this.io.getPointerField(this, 19);
	}

	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({ 21 })
	@Field(20)
	public Pointer<Byte> BusinessUnit() {
		return this.io.getPointerField(this, 20);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(21)
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 21);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(21)
	public CThostFtdcErrOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 21, OrderActionStatus);
		return this;
	}

	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({ 16 })
	@Field(22)
	public Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 22);
	}

	/**
	 * \u05f4\u032c\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({ 81 })
	@Field(23)
	public Pointer<Byte> StatusMsg() {
		return this.io.getPointerField(this, 23);
	}

	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({ 31 })
	@Field(24)
	public Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 24);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(25)
	public int ErrorID() {
		return this.io.getIntField(this, 25);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(25)
	public CThostFtdcErrOrderActionField ErrorID(int ErrorID) {
		this.io.setIntField(this, 25, ErrorID);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({ 81 })
	@Field(26)
	public Pointer<Byte> ErrorMsg() {
		return this.io.getPointerField(this, 26);
	}

	public CThostFtdcErrOrderActionField() {
		super();
	}

	public CThostFtdcErrOrderActionField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
