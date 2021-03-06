package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\u036c\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1720</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcSyncDepositField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcDepositSeqNoType
	 */
	@Array({15}) 
	@Field(0) 
	public Pointer<Byte > DepositSeqNo() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double Deposit() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcSyncDepositField Deposit(double Deposit) {
		this.io.setDoubleField(this, 3, Deposit);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\u01ff\ufffd\u01bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public int IsForce() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\u01f7\ufffd\u01ff\ufffd\u01bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public CThostFtdcSyncDepositField IsForce(int IsForce) {
		this.io.setIntField(this, 4, IsForce);
		return this;
	}
	public CThostFtdcSyncDepositField() {
		super();
	}
	public CThostFtdcSyncDepositField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
