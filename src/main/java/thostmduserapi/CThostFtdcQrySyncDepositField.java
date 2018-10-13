package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:2305</i><br>
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
public class CThostFtdcQrySyncDepositField extends StructObject {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcDepositSeqNoType
	 */
	@Array({ 15 })
	@Field(1)
	public Pointer<Byte> DepositSeqNo() {
		return this.io.getPointerField(this, 1);
	}

	public CThostFtdcQrySyncDepositField() {
		super();
	}

	public CThostFtdcQrySyncDepositField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
