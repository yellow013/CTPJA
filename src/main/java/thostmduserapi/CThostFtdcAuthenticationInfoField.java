package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd\u03e2<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:114</i><br>
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
public class CThostFtdcAuthenticationInfoField extends StructObject {
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
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({ 16 })
	@Field(1)
	public Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 1);
	}

	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({ 11 })
	@Field(2)
	public Pointer<Byte> UserProductInfo() {
		return this.io.getPointerField(this, 2);
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcAuthInfoType
	 */
	@Array({ 129 })
	@Field(3)
	public Pointer<Byte> AuthInfo() {
		return this.io.getPointerField(this, 3);
	}

	/**
	 * \ufffd\u01f7\ufffd\u03aa\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4)
	public int IsResult() {
		return this.io.getIntField(this, 4);
	}

	/**
	 * \ufffd\u01f7\ufffd\u03aa\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4)
	public CThostFtdcAuthenticationInfoField IsResult(int IsResult) {
		this.io.setIntField(this, 4, IsResult);
		return this;
	}

	public CThostFtdcAuthenticationInfoField() {
		super();
	}

	public CThostFtdcAuthenticationInfoField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
