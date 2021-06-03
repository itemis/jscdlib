// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagNEWTEXTMETRICA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("tmHeight"),
        C_LONG.withName("tmAscent"),
        C_LONG.withName("tmDescent"),
        C_LONG.withName("tmInternalLeading"),
        C_LONG.withName("tmExternalLeading"),
        C_LONG.withName("tmAveCharWidth"),
        C_LONG.withName("tmMaxCharWidth"),
        C_LONG.withName("tmWeight"),
        C_LONG.withName("tmOverhang"),
        C_LONG.withName("tmDigitizedAspectX"),
        C_LONG.withName("tmDigitizedAspectY"),
        C_CHAR.withName("tmFirstChar"),
        C_CHAR.withName("tmLastChar"),
        C_CHAR.withName("tmDefaultChar"),
        C_CHAR.withName("tmBreakChar"),
        C_CHAR.withName("tmItalic"),
        C_CHAR.withName("tmUnderlined"),
        C_CHAR.withName("tmStruckOut"),
        C_CHAR.withName("tmPitchAndFamily"),
        C_CHAR.withName("tmCharSet"),
        MemoryLayout.paddingLayout(24),
        C_LONG.withName("ntmFlags"),
        C_INT.withName("ntmSizeEM"),
        C_INT.withName("ntmCellHeight"),
        C_INT.withName("ntmAvgWidth")
    ).withName("tagNEWTEXTMETRICA");
    public static MemoryLayout $LAYOUT() {
        return tagNEWTEXTMETRICA.$struct$LAYOUT;
    }
    static final VarHandle tmHeight$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmHeight"));
    public static VarHandle tmHeight$VH() {
        return tagNEWTEXTMETRICA.tmHeight$VH;
    }
    public static int tmHeight$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmHeight$VH.get(seg);
    }
    public static void tmHeight$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmHeight$VH.set(seg, x);
    }
    public static int tmHeight$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmHeight$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAscent$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmAscent"));
    public static VarHandle tmAscent$VH() {
        return tagNEWTEXTMETRICA.tmAscent$VH;
    }
    public static int tmAscent$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmAscent$VH.get(seg);
    }
    public static void tmAscent$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmAscent$VH.set(seg, x);
    }
    public static int tmAscent$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmAscent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAscent$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmAscent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDescent$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmDescent"));
    public static VarHandle tmDescent$VH() {
        return tagNEWTEXTMETRICA.tmDescent$VH;
    }
    public static int tmDescent$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmDescent$VH.get(seg);
    }
    public static void tmDescent$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmDescent$VH.set(seg, x);
    }
    public static int tmDescent$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmDescent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDescent$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmDescent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmInternalLeading$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmInternalLeading"));
    public static VarHandle tmInternalLeading$VH() {
        return tagNEWTEXTMETRICA.tmInternalLeading$VH;
    }
    public static int tmInternalLeading$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmInternalLeading$VH.get(seg);
    }
    public static void tmInternalLeading$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmInternalLeading$VH.set(seg, x);
    }
    public static int tmInternalLeading$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmInternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmInternalLeading$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmInternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmExternalLeading$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmExternalLeading"));
    public static VarHandle tmExternalLeading$VH() {
        return tagNEWTEXTMETRICA.tmExternalLeading$VH;
    }
    public static int tmExternalLeading$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmExternalLeading$VH.get(seg);
    }
    public static void tmExternalLeading$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmExternalLeading$VH.set(seg, x);
    }
    public static int tmExternalLeading$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmExternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmExternalLeading$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmExternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAveCharWidth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmAveCharWidth"));
    public static VarHandle tmAveCharWidth$VH() {
        return tagNEWTEXTMETRICA.tmAveCharWidth$VH;
    }
    public static int tmAveCharWidth$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmAveCharWidth$VH.get(seg);
    }
    public static void tmAveCharWidth$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmAveCharWidth$VH.set(seg, x);
    }
    public static int tmAveCharWidth$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmAveCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAveCharWidth$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmAveCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmMaxCharWidth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmMaxCharWidth"));
    public static VarHandle tmMaxCharWidth$VH() {
        return tagNEWTEXTMETRICA.tmMaxCharWidth$VH;
    }
    public static int tmMaxCharWidth$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmMaxCharWidth$VH.get(seg);
    }
    public static void tmMaxCharWidth$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmMaxCharWidth$VH.set(seg, x);
    }
    public static int tmMaxCharWidth$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmMaxCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmMaxCharWidth$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmMaxCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmWeight$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmWeight"));
    public static VarHandle tmWeight$VH() {
        return tagNEWTEXTMETRICA.tmWeight$VH;
    }
    public static int tmWeight$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmWeight$VH.get(seg);
    }
    public static void tmWeight$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmWeight$VH.set(seg, x);
    }
    public static int tmWeight$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmWeight$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmOverhang$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmOverhang"));
    public static VarHandle tmOverhang$VH() {
        return tagNEWTEXTMETRICA.tmOverhang$VH;
    }
    public static int tmOverhang$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmOverhang$VH.get(seg);
    }
    public static void tmOverhang$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmOverhang$VH.set(seg, x);
    }
    public static int tmOverhang$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmOverhang$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmOverhang$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmOverhang$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectX$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmDigitizedAspectX"));
    public static VarHandle tmDigitizedAspectX$VH() {
        return tagNEWTEXTMETRICA.tmDigitizedAspectX$VH;
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmDigitizedAspectX$VH.get(seg);
    }
    public static void tmDigitizedAspectX$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmDigitizedAspectX$VH.set(seg, x);
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmDigitizedAspectX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectX$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmDigitizedAspectX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectY$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tmDigitizedAspectY"));
    public static VarHandle tmDigitizedAspectY$VH() {
        return tagNEWTEXTMETRICA.tmDigitizedAspectY$VH;
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.tmDigitizedAspectY$VH.get(seg);
    }
    public static void tmDigitizedAspectY$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.tmDigitizedAspectY$VH.set(seg, x);
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.tmDigitizedAspectY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectY$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.tmDigitizedAspectY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmFirstChar$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmFirstChar"));
    public static VarHandle tmFirstChar$VH() {
        return tagNEWTEXTMETRICA.tmFirstChar$VH;
    }
    public static byte tmFirstChar$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmFirstChar$VH.get(seg);
    }
    public static void tmFirstChar$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmFirstChar$VH.set(seg, x);
    }
    public static byte tmFirstChar$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmFirstChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmFirstChar$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmFirstChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmLastChar$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmLastChar"));
    public static VarHandle tmLastChar$VH() {
        return tagNEWTEXTMETRICA.tmLastChar$VH;
    }
    public static byte tmLastChar$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmLastChar$VH.get(seg);
    }
    public static void tmLastChar$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmLastChar$VH.set(seg, x);
    }
    public static byte tmLastChar$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmLastChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmLastChar$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmLastChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDefaultChar$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmDefaultChar"));
    public static VarHandle tmDefaultChar$VH() {
        return tagNEWTEXTMETRICA.tmDefaultChar$VH;
    }
    public static byte tmDefaultChar$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmDefaultChar$VH.get(seg);
    }
    public static void tmDefaultChar$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmDefaultChar$VH.set(seg, x);
    }
    public static byte tmDefaultChar$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmDefaultChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDefaultChar$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmDefaultChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmBreakChar$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmBreakChar"));
    public static VarHandle tmBreakChar$VH() {
        return tagNEWTEXTMETRICA.tmBreakChar$VH;
    }
    public static byte tmBreakChar$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmBreakChar$VH.get(seg);
    }
    public static void tmBreakChar$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmBreakChar$VH.set(seg, x);
    }
    public static byte tmBreakChar$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmBreakChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmBreakChar$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmBreakChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmItalic$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmItalic"));
    public static VarHandle tmItalic$VH() {
        return tagNEWTEXTMETRICA.tmItalic$VH;
    }
    public static byte tmItalic$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmItalic$VH.get(seg);
    }
    public static void tmItalic$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmItalic$VH.set(seg, x);
    }
    public static byte tmItalic$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmItalic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmItalic$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmItalic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmUnderlined$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmUnderlined"));
    public static VarHandle tmUnderlined$VH() {
        return tagNEWTEXTMETRICA.tmUnderlined$VH;
    }
    public static byte tmUnderlined$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmUnderlined$VH.get(seg);
    }
    public static void tmUnderlined$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmUnderlined$VH.set(seg, x);
    }
    public static byte tmUnderlined$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmUnderlined$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmUnderlined$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmUnderlined$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmStruckOut$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmStruckOut"));
    public static VarHandle tmStruckOut$VH() {
        return tagNEWTEXTMETRICA.tmStruckOut$VH;
    }
    public static byte tmStruckOut$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmStruckOut$VH.get(seg);
    }
    public static void tmStruckOut$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmStruckOut$VH.set(seg, x);
    }
    public static byte tmStruckOut$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmStruckOut$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmStruckOut$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmStruckOut$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmPitchAndFamily$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmPitchAndFamily"));
    public static VarHandle tmPitchAndFamily$VH() {
        return tagNEWTEXTMETRICA.tmPitchAndFamily$VH;
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmPitchAndFamily$VH.get(seg);
    }
    public static void tmPitchAndFamily$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmPitchAndFamily$VH.set(seg, x);
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmPitchAndFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmPitchAndFamily$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmPitchAndFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmCharSet$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("tmCharSet"));
    public static VarHandle tmCharSet$VH() {
        return tagNEWTEXTMETRICA.tmCharSet$VH;
    }
    public static byte tmCharSet$get(MemorySegment seg) {
        return (byte)tagNEWTEXTMETRICA.tmCharSet$VH.get(seg);
    }
    public static void tmCharSet$set( MemorySegment seg, byte x) {
        tagNEWTEXTMETRICA.tmCharSet$VH.set(seg, x);
    }
    public static byte tmCharSet$get(MemorySegment seg, long index) {
        return (byte)tagNEWTEXTMETRICA.tmCharSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmCharSet$set(MemorySegment seg, long index, byte x) {
        tagNEWTEXTMETRICA.tmCharSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ntmFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ntmFlags"));
    public static VarHandle ntmFlags$VH() {
        return tagNEWTEXTMETRICA.ntmFlags$VH;
    }
    public static int ntmFlags$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.ntmFlags$VH.get(seg);
    }
    public static void ntmFlags$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.ntmFlags$VH.set(seg, x);
    }
    public static int ntmFlags$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.ntmFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ntmFlags$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.ntmFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ntmSizeEM$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ntmSizeEM"));
    public static VarHandle ntmSizeEM$VH() {
        return tagNEWTEXTMETRICA.ntmSizeEM$VH;
    }
    public static int ntmSizeEM$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.ntmSizeEM$VH.get(seg);
    }
    public static void ntmSizeEM$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.ntmSizeEM$VH.set(seg, x);
    }
    public static int ntmSizeEM$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.ntmSizeEM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ntmSizeEM$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.ntmSizeEM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ntmCellHeight$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ntmCellHeight"));
    public static VarHandle ntmCellHeight$VH() {
        return tagNEWTEXTMETRICA.ntmCellHeight$VH;
    }
    public static int ntmCellHeight$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.ntmCellHeight$VH.get(seg);
    }
    public static void ntmCellHeight$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.ntmCellHeight$VH.set(seg, x);
    }
    public static int ntmCellHeight$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.ntmCellHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ntmCellHeight$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.ntmCellHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ntmAvgWidth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ntmAvgWidth"));
    public static VarHandle ntmAvgWidth$VH() {
        return tagNEWTEXTMETRICA.ntmAvgWidth$VH;
    }
    public static int ntmAvgWidth$get(MemorySegment seg) {
        return (int)tagNEWTEXTMETRICA.ntmAvgWidth$VH.get(seg);
    }
    public static void ntmAvgWidth$set( MemorySegment seg, int x) {
        tagNEWTEXTMETRICA.ntmAvgWidth$VH.set(seg, x);
    }
    public static int ntmAvgWidth$get(MemorySegment seg, long index) {
        return (int)tagNEWTEXTMETRICA.ntmAvgWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ntmAvgWidth$set(MemorySegment seg, long index, int x) {
        tagNEWTEXTMETRICA.ntmAvgWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


