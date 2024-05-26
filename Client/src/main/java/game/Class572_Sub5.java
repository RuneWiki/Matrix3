package game;

/* Class572_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

public class Class572_Sub5 extends Class572 {
	public int anInt9011;
	public int anInt9012;
	static final int anInt9013 = 21;
	String aString9014;
	static final int anInt9015 = 4;
	int anInt9016;
	static final int anInt9017 = 3;
	static final int anInt9018 = 23;
	static final int anInt9019 = 2;
	String aString9020;
	static final int anInt9021 = 4;
	static final int anInt9022 = 5;
	boolean aBool9023;
	static final int anInt9024 = 7;
	static final int anInt9025 = 8;
	static final int anInt9026 = 9;
	static final int anInt9027 = 1;
	int anInt9028;
	static final int anInt9029 = 22;
	static final int anInt9030 = 3;
	static final int anInt9031 = 24;
	int anInt9032;
	static final int anInt9033 = 26;
	int anInt9034;
	static final int anInt9035 = 1;
	static final int anInt9036 = 2;
	static final int anInt9037 = 3;
	static final int anInt9038 = 4;
	int anInt9039;
	int anInt9040;
	int anInt9041;
	static final int anInt9042 = 1;
	static final int anInt9043 = 6;
	int anInt9044;
	static final int anInt9045 = 0;
	int anInt9046;
	public static final int anInt9047 = 0;
	public int anInt9048;
	boolean aBool9049;
	String aString9050;
	String aString9051;
	String aString9052;
	static final int anInt9053 = 25;
	static final int anInt9054 = 20;
	int anInt9055;
	static final int anInt9056 = 2;
	int anInt9057;
	String aString9058;
	String aString9059;
	int[] anIntArray9060 = new int[3];
	int anInt9061;
	static final int anInt9062 = 7;

	void method8373() {
		if (((Class572_Sub5) this).aString9014.length() > 40)
			((Class572_Sub5) this).aString9014 = ((Class572_Sub5) this).aString9014.substring(0, 40);
		if (((Class572_Sub5) this).aString9020.length() > 40)
			((Class572_Sub5) this).aString9020 = ((Class572_Sub5) this).aString9020.substring(0, 40);
		if (((Class572_Sub5) this).aString9052.length() > 10)
			((Class572_Sub5) this).aString9052 = ((Class572_Sub5) this).aString9052.substring(0, 10);
		if (((Class572_Sub5) this).aString9050.length() > 10)
			((Class572_Sub5) this).aString9050 = ((Class572_Sub5) this).aString9050.substring(0, 10);
		if (((Class572_Sub5) this).aString9051.length() > 120)
			((Class572_Sub5) this).aString9051 = ((Class572_Sub5) this).aString9051.substring(0, 120);
	}

	void method8374(byte i) {
		if (((Class572_Sub5) this).aString9014.length() > 40)
			((Class572_Sub5) this).aString9014 = ((Class572_Sub5) this).aString9014.substring(0, 40);
		if (((Class572_Sub5) this).aString9020.length() > 40)
			((Class572_Sub5) this).aString9020 = ((Class572_Sub5) this).aString9020.substring(0, 40);
		if (((Class572_Sub5) this).aString9052.length() > 10)
			((Class572_Sub5) this).aString9052 = ((Class572_Sub5) this).aString9052.substring(0, 10);
		if (((Class572_Sub5) this).aString9050.length() > 10)
			((Class572_Sub5) this).aString9050 = ((Class572_Sub5) this).aString9050.substring(0, 10);
		if (((Class572_Sub5) this).aString9051.length() > 120)
			((Class572_Sub5) this).aString9051 = ((Class572_Sub5) this).aString9051.substring(0, 120);
	}

	public int method8375() {
		int i = 38;
		i += Class269.method3657(((Class572_Sub5) this).aString9014, -529610565);
		i += Class269.method3657(((Class572_Sub5) this).aString9020, 1403139134);
		i += Class269.method3657(((Class572_Sub5) this).aString9052, -404543004);
		i += Class269.method3657(((Class572_Sub5) this).aString9050, -1583279432);
		i += Class269.method3657(((Class572_Sub5) this).aString9058, 1617249751);
		i += Class269.method3657(((Class572_Sub5) this).aString9059, 1222008060);
		i += Class269.method3657(((Class572_Sub5) this).aString9051, -535601382);
		return i;
	}

	public void method8376(RSByteBuffer class572_sub15, int i) {
		class572_sub15.writeByte(7, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9044 * 311015607, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9023 ? 1 : 0, -1384395473);
		class572_sub15.writeByte((-1491140043 * ((Class572_Sub5) this).anInt9034), -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9039 * 1628368553), -1384395473);
		class572_sub15.writeByte(anInt9011 * -1549389749, -1384395473);
		class572_sub15.writeByte(793558487 * ((Class572_Sub5) this).anInt9041, -1384395473);
		class572_sub15.writeByte(-653201491 * anInt9012, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9049 ? 1 : 0, -1384395473);
		class572_sub15.writeShort((((Class572_Sub5) this).anInt9016 * -491851003), -1581410545);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9046 * -1239286663), -1384395473);
		class572_sub15.write24BitInteger(anInt9048 * -1590322869, 383008467);
		class572_sub15.writeShort((-809421851 * ((Class572_Sub5) this).anInt9040), -833254472);
		class572_sub15.method8460(((Class572_Sub5) this).aString9014, (byte) 93);
		class572_sub15.method8460(((Class572_Sub5) this).aString9020, (byte) 126);
		class572_sub15.method8460(((Class572_Sub5) this).aString9052, (byte) 7);
		class572_sub15.method8460(((Class572_Sub5) this).aString9050, (byte) 4);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9055 * 1840871211), -1384395473);
		class572_sub15.writeShort(((Class572_Sub5) this).anInt9028 * 377219883, -1990334137);
		class572_sub15.method8460(((Class572_Sub5) this).aString9058, (byte) 7);
		class572_sub15.method8460(((Class572_Sub5) this).aString9059, (byte) 101);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9032 * 509996067, -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9057 * -1620428693), -1384395473);
		for (int i_0_ = 0; i_0_ < ((Class572_Sub5) this).anIntArray9060.length; i_0_++)
			class572_sub15.writeInt((((Class572_Sub5) this).anIntArray9060[i_0_]), -1743753997);
		class572_sub15.writeInt(((Class572_Sub5) this).anInt9061 * 270085331, -1743753997);
		class572_sub15.method8460(((Class572_Sub5) this).aString9051, (byte) 104);
	}

	public int method8377(short i) {
		int i_1_ = 38;
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9014, -456364130);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9020, 1760361806);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9052, 71689856);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9050, -463150397);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9058, -1728144322);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9059, 323554366);
		i_1_ += Class269.method3657(((Class572_Sub5) this).aString9051, 190398754);
		return i_1_;
	}

	void method8378() {
		if (((Class572_Sub5) this).aString9014.length() > 40)
			((Class572_Sub5) this).aString9014 = ((Class572_Sub5) this).aString9014.substring(0, 40);
		if (((Class572_Sub5) this).aString9020.length() > 40)
			((Class572_Sub5) this).aString9020 = ((Class572_Sub5) this).aString9020.substring(0, 40);
		if (((Class572_Sub5) this).aString9052.length() > 10)
			((Class572_Sub5) this).aString9052 = ((Class572_Sub5) this).aString9052.substring(0, 10);
		if (((Class572_Sub5) this).aString9050.length() > 10)
			((Class572_Sub5) this).aString9050 = ((Class572_Sub5) this).aString9050.substring(0, 10);
		if (((Class572_Sub5) this).aString9051.length() > 120)
			((Class572_Sub5) this).aString9051 = ((Class572_Sub5) this).aString9051.substring(0, 120);
	}

	public void method8379(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(7, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9044 * 311015607, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9023 ? 1 : 0, -1384395473);
		class572_sub15.writeByte((-1491140043 * ((Class572_Sub5) this).anInt9034), -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9039 * 1628368553), -1384395473);
		class572_sub15.writeByte(anInt9011 * -1549389749, -1384395473);
		class572_sub15.writeByte(793558487 * ((Class572_Sub5) this).anInt9041, -1384395473);
		class572_sub15.writeByte(-653201491 * anInt9012, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9049 ? 1 : 0, -1384395473);
		class572_sub15.writeShort((((Class572_Sub5) this).anInt9016 * -491851003), -1907107270);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9046 * -1239286663), -1384395473);
		class572_sub15.write24BitInteger(anInt9048 * -1590322869, 994842768);
		class572_sub15.writeShort((-809421851 * ((Class572_Sub5) this).anInt9040), -914872037);
		class572_sub15.method8460(((Class572_Sub5) this).aString9014, (byte) 14);
		class572_sub15.method8460(((Class572_Sub5) this).aString9020, (byte) 71);
		class572_sub15.method8460(((Class572_Sub5) this).aString9052, (byte) 53);
		class572_sub15.method8460(((Class572_Sub5) this).aString9050, (byte) 59);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9055 * 1840871211), -1384395473);
		class572_sub15.writeShort(((Class572_Sub5) this).anInt9028 * 377219883, -1674726709);
		class572_sub15.method8460(((Class572_Sub5) this).aString9058, (byte) 63);
		class572_sub15.method8460(((Class572_Sub5) this).aString9059, (byte) 71);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9032 * 509996067, -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9057 * -1620428693), -1384395473);
		for (int i = 0; i < ((Class572_Sub5) this).anIntArray9060.length; i++)
			class572_sub15.writeInt(((Class572_Sub5) this).anIntArray9060[i], -1743753997);
		class572_sub15.writeInt(((Class572_Sub5) this).anInt9061 * 270085331, -1743753997);
		class572_sub15.method8460(((Class572_Sub5) this).aString9051, (byte) 50);
	}

	public void method8380(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(7, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9044 * 311015607, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9023 ? 1 : 0, -1384395473);
		class572_sub15.writeByte((-1491140043 * ((Class572_Sub5) this).anInt9034), -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9039 * 1628368553), -1384395473);
		class572_sub15.writeByte(anInt9011 * -1549389749, -1384395473);
		class572_sub15.writeByte(793558487 * ((Class572_Sub5) this).anInt9041, -1384395473);
		class572_sub15.writeByte(-653201491 * anInt9012, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9049 ? 1 : 0, -1384395473);
		class572_sub15.writeShort((((Class572_Sub5) this).anInt9016 * -491851003), -1158794467);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9046 * -1239286663), -1384395473);
		class572_sub15.write24BitInteger(anInt9048 * -1590322869, -1854132911);
		class572_sub15.writeShort((-809421851 * ((Class572_Sub5) this).anInt9040), -1864336223);
		class572_sub15.method8460(((Class572_Sub5) this).aString9014, (byte) 117);
		class572_sub15.method8460(((Class572_Sub5) this).aString9020, (byte) 99);
		class572_sub15.method8460(((Class572_Sub5) this).aString9052, (byte) 85);
		class572_sub15.method8460(((Class572_Sub5) this).aString9050, (byte) 125);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9055 * 1840871211), -1384395473);
		class572_sub15.writeShort(((Class572_Sub5) this).anInt9028 * 377219883, -1158564761);
		class572_sub15.method8460(((Class572_Sub5) this).aString9058, (byte) 125);
		class572_sub15.method8460(((Class572_Sub5) this).aString9059, (byte) 83);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9032 * 509996067, -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9057 * -1620428693), -1384395473);
		for (int i = 0; i < ((Class572_Sub5) this).anIntArray9060.length; i++)
			class572_sub15.writeInt(((Class572_Sub5) this).anIntArray9060[i], -1743753997);
		class572_sub15.writeInt(((Class572_Sub5) this).anInt9061 * 270085331, -1743753997);
		class572_sub15.method8460(((Class572_Sub5) this).aString9051, (byte) 32);
	}

	public void method8381(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(7, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9044 * 311015607, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9023 ? 1 : 0, -1384395473);
		class572_sub15.writeByte((-1491140043 * ((Class572_Sub5) this).anInt9034), -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9039 * 1628368553), -1384395473);
		class572_sub15.writeByte(anInt9011 * -1549389749, -1384395473);
		class572_sub15.writeByte(793558487 * ((Class572_Sub5) this).anInt9041, -1384395473);
		class572_sub15.writeByte(-653201491 * anInt9012, -1384395473);
		class572_sub15.writeByte(((Class572_Sub5) this).aBool9049 ? 1 : 0, -1384395473);
		class572_sub15.writeShort((((Class572_Sub5) this).anInt9016 * -491851003), -1966132125);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9046 * -1239286663), -1384395473);
		class572_sub15.write24BitInteger(anInt9048 * -1590322869, -455660923);
		class572_sub15.writeShort((-809421851 * ((Class572_Sub5) this).anInt9040), -1430373069);
		class572_sub15.method8460(((Class572_Sub5) this).aString9014, (byte) 84);
		class572_sub15.method8460(((Class572_Sub5) this).aString9020, (byte) 71);
		class572_sub15.method8460(((Class572_Sub5) this).aString9052, (byte) 39);
		class572_sub15.method8460(((Class572_Sub5) this).aString9050, (byte) 17);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9055 * 1840871211), -1384395473);
		class572_sub15.writeShort(((Class572_Sub5) this).anInt9028 * 377219883, -1046880004);
		class572_sub15.method8460(((Class572_Sub5) this).aString9058, (byte) 24);
		class572_sub15.method8460(((Class572_Sub5) this).aString9059, (byte) 96);
		class572_sub15.writeByte(((Class572_Sub5) this).anInt9032 * 509996067, -1384395473);
		class572_sub15.writeByte((((Class572_Sub5) this).anInt9057 * -1620428693), -1384395473);
		for (int i = 0; i < ((Class572_Sub5) this).anIntArray9060.length; i++)
			class572_sub15.writeInt(((Class572_Sub5) this).anIntArray9060[i], -1743753997);
		class572_sub15.writeInt(((Class572_Sub5) this).anInt9061 * 270085331, -1743753997);
		class572_sub15.method8460(((Class572_Sub5) this).aString9051, (byte) 77);
	}

	public int method8382() {
		int i = 38;
		i += Class269.method3657(((Class572_Sub5) this).aString9014, -293298247);
		i += Class269.method3657(((Class572_Sub5) this).aString9020, -25014480);
		i += Class269.method3657(((Class572_Sub5) this).aString9052, -125312072);
		i += Class269.method3657(((Class572_Sub5) this).aString9050, 1717946621);
		i += Class269.method3657(((Class572_Sub5) this).aString9058, -1501060462);
		i += Class269.method3657(((Class572_Sub5) this).aString9059, -1433397897);
		i += Class269.method3657(((Class572_Sub5) this).aString9051, 625832644);
		return i;
	}

	public int method8383() {
		int i = 38;
		i += Class269.method3657(((Class572_Sub5) this).aString9014, 939764093);
		i += Class269.method3657(((Class572_Sub5) this).aString9020, 19026451);
		i += Class269.method3657(((Class572_Sub5) this).aString9052, 461236314);
		i += Class269.method3657(((Class572_Sub5) this).aString9050, 655772603);
		i += Class269.method3657(((Class572_Sub5) this).aString9058, -1888938755);
		i += Class269.method3657(((Class572_Sub5) this).aString9059, 2081451847);
		i += Class269.method3657(((Class572_Sub5) this).aString9051, 1108625399);
		return i;
	}

	public int method8384() {
		int i = 38;
		i += Class269.method3657(((Class572_Sub5) this).aString9014, -1443724998);
		i += Class269.method3657(((Class572_Sub5) this).aString9020, 1039567517);
		i += Class269.method3657(((Class572_Sub5) this).aString9052, 2131656280);
		i += Class269.method3657(((Class572_Sub5) this).aString9050, -1702737524);
		i += Class269.method3657(((Class572_Sub5) this).aString9058, 1107565121);
		i += Class269.method3657(((Class572_Sub5) this).aString9059, 1776414756);
		i += Class269.method3657(((Class572_Sub5) this).aString9051, 976301363);
		return i;
	}

	public Class572_Sub5(boolean bool) {
		if (bool) {
			if (Class572_Sub12_Sub2.aString11255.startsWith("win"))
				((Class572_Sub5) this).anInt9044 = -1119705849;
			else if (Class572_Sub12_Sub2.aString11255.startsWith("mac"))
				((Class572_Sub5) this).anInt9044 = 2055555598;
			else if (Class572_Sub12_Sub2.aString11255.startsWith("linux"))
				((Class572_Sub5) this).anInt9044 = 935849749;
			else
				((Class572_Sub5) this).anInt9044 = -183856100;
			if (Class184.aString2167.startsWith("amd64") || Class184.aString2167.startsWith("x86_64"))
				((Class572_Sub5) this).aBool9023 = true;
			else
				((Class572_Sub5) this).aBool9023 = false;
			if (1 == 311015607 * ((Class572_Sub5) this).anInt9044) {
				if (Class55.aString525.indexOf("4.0") != -1)
					((Class572_Sub5) this).anInt9034 = 1260503069;
				else if (Class55.aString525.indexOf("4.1") != -1)
					((Class572_Sub5) this).anInt9034 = -1773961158;
				else if (Class55.aString525.indexOf("4.9") != -1)
					((Class572_Sub5) this).anInt9034 = -513458089;
				else if (Class55.aString525.indexOf("5.0") != -1)
					((Class572_Sub5) this).anInt9034 = 747044980;
				else if (Class55.aString525.indexOf("5.1") != -1)
					((Class572_Sub5) this).anInt9034 = 2007548049;
				else if (Class55.aString525.indexOf("5.2") != -1)
					((Class572_Sub5) this).anInt9034 = 1494089960;
				else if (Class55.aString525.indexOf("6.0") != -1)
					((Class572_Sub5) this).anInt9034 = -1026916178;
				else if (Class55.aString525.indexOf("6.1") != -1)
					((Class572_Sub5) this).anInt9034 = 233586891;
				else if (Class55.aString525.indexOf("6.2") != -1)
					((Class572_Sub5) this).anInt9034 = -1540374267;
			} else if (((Class572_Sub5) this).anInt9044 * 311015607 == 2) {
				if (Class55.aString525.indexOf("10.4") != -1)
					((Class572_Sub5) this).anInt9034 = -559742396;
				else if (Class55.aString525.indexOf("10.5") != -1)
					((Class572_Sub5) this).anInt9034 = 700760673;
				else if (Class55.aString525.indexOf("10.6") != -1)
					((Class572_Sub5) this).anInt9034 = 1961263742;
				else if (Class55.aString525.indexOf("10.7") != -1)
					((Class572_Sub5) this).anInt9034 = -1073200485;
				else if (Class55.aString525.indexOf("10.8") != -1)
					((Class572_Sub5) this).anInt9034 = 187302584;
				else if (Class55.aString525.indexOf("10.9") != -1)
					((Class572_Sub5) this).anInt9034 = 1447805653;
				else if (Class55.aString525.indexOf("10.10") != -1)
					((Class572_Sub5) this).anInt9034 = -1586658574;
			}
			if (Class584.aString7735.toLowerCase().indexOf("sun") != -1)
				((Class572_Sub5) this).anInt9039 = 632526233;
			else if (Class584.aString7735.toLowerCase().indexOf("microsoft") != -1)
				((Class572_Sub5) this).anInt9039 = 1265052466;
			else if (Class584.aString7735.toLowerCase().indexOf("apple") != -1)
				((Class572_Sub5) this).anInt9039 = 1897578699;
			else
				((Class572_Sub5) this).anInt9039 = -1764862364;
			int i = 2;
			int i_2_ = 0;
			try {
				for (/**/; i < Class648.aString8365.length(); i++) {
					int i_3_ = Class648.aString8365.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_2_ = i_3_ - 48 + i_2_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt9011 = 1502353763 * i_2_;
			i = Class648.aString8365.indexOf('.', 2) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < Class648.aString8365.length(); i++) {
					int i_4_ = Class648.aString8365.charAt(i);
					if (i_4_ < 48 || i_4_ > 57)
						break;
					i_2_ = i_4_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			((Class572_Sub5) this).anInt9041 = -2115992089 * i_2_;
			i = Class648.aString8365.indexOf('_', 4) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < Class648.aString8365.length(); i++) {
					int i_5_ = Class648.aString8365.charAt(i);
					if (i_5_ < 48 || i_5_ > 57)
						break;
					i_2_ = i_5_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt9012 = i_2_ * 1941851173;
			((Class572_Sub5) this).aBool9049 = false;
			((Class572_Sub5) this).anInt9016 = Class584.anInt7769 * -1802349079;
			if (-1549389749 * anInt9011 > 3)
				((Class572_Sub5) this).anInt9046 = Class584.anInt7742 * 165055893;
			else
				((Class572_Sub5) this).anInt9046 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (null != is && is.length == 3) {
					((Class572_Sub5) this).anInt9032 = -115334261 * is[0];
					((Class572_Sub5) this).anInt9040 = is[1] * -513682963;
					anInt9048 = -944363421 * is[2];
				}
				int[] is_6_ = HardwareInfo.getRawCPUInfo();
				if (is_6_ != null && is_6_.length % 5 == 0) {
					HashMap hashmap = new HashMap();
					for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
						int i_8_ = is_6_[5 * i_7_];
						int i_9_ = is_6_[5 * i_7_ + 1];
						int i_10_ = is_6_[5 * i_7_ + 2];
						int i_11_ = is_6_[i_7_ * 5 + 3];
						int i_12_ = is_6_[5 * i_7_ + 4];
						Class626 class626 = new Class626(i_8_, i_9_, i_10_, i_11_, i_12_);
						hashmap.put(Integer.valueOf(i_8_), class626);
					}
					Class626 class626 = (Class626) hashmap.get(Integer.valueOf(0));
					if (null != class626) {
						RSByteBuffer class572_sub15 = new RSByteBuffer(13);
						class572_sub15.method8455((512092191 * (((Class626) class626).anInt8084)), -1704029337);
						class572_sub15.method8455((1049116277 * (((Class626) class626).anInt8086)), -1704029337);
						class572_sub15.method8455((((Class626) class626).anInt8087) * -546362403, -1704029337);
						class572_sub15.o = 0;
						((Class572_Sub5) this).aString9058 = class572_sub15.readString(1295706626);
					}
					Class626 class626_13_ = (Class626) hashmap.get(Integer.valueOf(1));
					if (null != class626_13_) {
						((Class572_Sub5) this).anInt9061 = 990286435 * ((Class626) class626_13_).anInt8085;
						int i_14_ = ((Class626) class626_13_).anInt8084 * 512092191;
						((Class572_Sub5) this).anInt9057 = 1217967171 * (i_14_ >> 16 & 0xff);
						((Class572_Sub5) this).anIntArray9060[0] = ((Class626) class626_13_).anInt8087 * -546362403;
						((Class572_Sub5) this).anIntArray9060[1] = ((Class626) class626_13_).anInt8086 * 1049116277;
					}
					Class626 class626_15_ = (Class626) hashmap.get(Integer.valueOf(-2147483647));
					if (null != class626_15_)
						((Class572_Sub5) this).anIntArray9060[2] = ((Class626) class626_15_).anInt8086 * 1049116277;
					RSByteBuffer class572_sub15 = new RSByteBuffer(49);
					for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
						Class626 class626_17_ = (Class626) hashmap.get(Integer.valueOf(i_16_));
						if (null != class626_17_) {
							class572_sub15.method8455((((Class626) class626_17_).anInt8085 * 1128180633), -1704029337);
							class572_sub15.method8455((512092191 * (((Class626) class626_17_).anInt8084)), -1704029337);
							class572_sub15.method8455((((Class626) class626_17_).anInt8087 * -546362403), -1704029337);
							class572_sub15.method8455((1049116277 * (((Class626) class626_17_).anInt8086)), -1704029337);
						}
					}
					class572_sub15.o = 0;
					((Class572_Sub5) this).aString9059 = class572_sub15.readString(1295706626);
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && strings[0] != null) {
					for (int i_18_ = 0; i_18_ < strings[0].length; i_18_ += 2) {
						if (strings[0][i_18_].equalsIgnoreCase("szDescription"))
							((Class572_Sub5) this).aString9014 = strings[0][1 + i_18_];
						else if (strings[0][i_18_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_18_ + 1];
							try {
								int i_19_ = string.indexOf("/");
								int i_20_ = string.indexOf("/", 1 + i_19_);
								((Class572_Sub5) this).anInt9055 = ((Integer.parseInt(string.substring(0, i_19_))) * 1846906755);
								((Class572_Sub5) this).anInt9028 = ((Integer.parseInt(string.substring(i_20_ + 1, string.indexOf(" ", i_20_)))) * -1387562109);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_21_ = HardwareInfo.getDXDiagSystemProps();
				if (strings_21_ != null) {
					String string = "";
					String string_22_ = "";
					String string_23_ = "";
					for (int i_24_ = 0; i_24_ < strings_21_.length; i_24_ += 2) {
						if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_21_[i_24_ + 1];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_22_ = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_23_ = strings_21_[i_24_ + 1];
					}
					((Class572_Sub5) this).aString9052 = new StringBuilder().append(string).append(".").append(string_22_).append(string_23_).toString();
				}
			} catch (Throwable throwable) {
				anInt9048 = 0;
			}
		}
		if (((Class572_Sub5) this).aString9014 == null)
			((Class572_Sub5) this).aString9014 = "";
		if (null == ((Class572_Sub5) this).aString9020)
			((Class572_Sub5) this).aString9020 = "";
		if (null == ((Class572_Sub5) this).aString9052)
			((Class572_Sub5) this).aString9052 = "";
		if (((Class572_Sub5) this).aString9050 == null)
			((Class572_Sub5) this).aString9050 = "";
		if (((Class572_Sub5) this).aString9058 == null)
			((Class572_Sub5) this).aString9058 = "";
		if (((Class572_Sub5) this).aString9059 == null)
			((Class572_Sub5) this).aString9059 = "";
		if (null == ((Class572_Sub5) this).aString9051)
			((Class572_Sub5) this).aString9051 = "";
		method8374((byte) 0);
	}

	static final void method8385(Cs2Executor class441, int i) {
		if (null != client.aString8579)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = client.aString8579;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}
}
