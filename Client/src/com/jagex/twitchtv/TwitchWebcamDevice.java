/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import java.util.LinkedList;

public class TwitchWebcamDevice {
	public String aString2056;
	public String aString2057;
	public int anInt2058;
	public int anInt2059;
	private LinkedList aLinkedList2060 = new LinkedList();

	public TwitchWebcamDevice(int i, int i_0_, String string, String string_1_) {
		anInt2058 = i * 993984791;
		anInt2059 = i_0_ * -1996163813;
		aString2056 = string;
		aString2057 = string_1_;
	}

	public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		aLinkedList2060.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_, i_4_, i_5_));
	}

	public TwitchWebcamDeviceCapability method2694(int i) {
		if (i < 0 || i >= aLinkedList2060.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList2060.get(i);
	}

	public TwitchWebcamDeviceCapability method2695(int i) {
		for (int i_6_ = 0; i_6_ < aLinkedList2060.size(); i_6_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList2060.get(i_6_)).anInt3666) * -1851940155 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList2060.get(i_6_));
		}
		return null;
	}

	public int method2696() {
		return aLinkedList2060.size();
	}

	public int method2697() {
		return aLinkedList2060.size();
	}

	public int method2698() {
		return aLinkedList2060.size();
	}

	public int method2699() {
		return aLinkedList2060.size();
	}
}
