package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1489</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcExchangeOrderActionField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(2) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(2) 
	public CThostFtdcExchangeOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 2, ActionFlag);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public CThostFtdcExchangeOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 3, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(4) 
	public int VolumeChange() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u4eef<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(4) 
	public CThostFtdcExchangeOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 4, VolumeChange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ActionDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > ActionTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(8) 
	public int InstallID() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(8) 
	public CThostFtdcExchangeOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 8, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(9) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0631\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(10) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(11) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(12) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(13) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(14) 
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(14) 
	public CThostFtdcExchangeOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 14, OrderActionStatus);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(15) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 15);
	}
	public CThostFtdcExchangeOrderActionField() {
		super();
	}
	public CThostFtdcExchangeOrderActionField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
