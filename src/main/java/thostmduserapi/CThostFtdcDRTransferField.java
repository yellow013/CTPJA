package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\u05b1\ufffd\ufffd\ufffd\ufffd\ufffd\u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:5869</i><br>
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
public class CThostFtdcDRTransferField extends StructObject {
	/**
	 * \u052d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(0)
	public int OrigDRIdentityID() {
		return this.io.getIntField(this, 0);
	}

	/**
	 * \u052d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(0)
	public CThostFtdcDRTransferField OrigDRIdentityID(int OrigDRIdentityID) {
		this.io.setIntField(this, 0, OrigDRIdentityID);
		return this;
	}

	/**
	 * \u013f\ufffd\uaf7b\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(1)
	public int DestDRIdentityID() {
		return this.io.getIntField(this, 1);
	}

	/**
	 * \u013f\ufffd\uaf7b\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(1)
	public CThostFtdcDRTransferField DestDRIdentityID(int DestDRIdentityID) {
		this.io.setIntField(this, 1, DestDRIdentityID);
		return this;
	}

	/**
	 * \u052d\u04e6\ufffd\u00f5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(2)
	public Pointer<Byte> OrigBrokerID() {
		return this.io.getPointerField(this, 2);
	}

	/**
	 * \u013f\ufffd\ufffd\ufffd\ufffd\ufffd\u00f5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(3)
	public Pointer<Byte> DestBrokerID() {
		return this.io.getPointerField(this, 3);
	}

	public CThostFtdcDRTransferField() {
		super();
	}

	public CThostFtdcDRTransferField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
