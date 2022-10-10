package ru.minusd.denisov.lab06.task13;

public class StringBuilderNotifier {
    private StringBuilder sb;
    public ActionManager actionManager;

    public StringBuilderNotifier() {
        sb = new StringBuilder();
        actionManager = new ActionManager(StringBuilderAction.values());
    }

    public StringBuilderNotifier(int capacity) {
        sb = new StringBuilder(capacity);
        actionManager = new ActionManager(StringBuilderAction.values());
    }

    public StringBuilderNotifier(String str) {
        sb = new StringBuilder(str);
        actionManager = new ActionManager(StringBuilderAction.values());
    }

    public StringBuilderNotifier(CharSequence seq) {
        sb = new StringBuilder(seq);
        actionManager = new ActionManager(StringBuilderAction.values());
    }

    private StringBuilder getStringBuilder() {
        return sb;
    }

    public int compareTo(StringBuilderNotifier another) {
        return sb.compareTo(another.getStringBuilder());
    }

    public StringBuilderNotifier append(Object obj) {
        sb.append(obj);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(String str) {
        sb.append(str);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(StringBuffer sb) {
        this.sb.append(sb);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(CharSequence s) {
        sb.append(s);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(CharSequence s, int start, int end) {
        sb.append(s);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(char[] str) {
        sb.append(str);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(char[] str, int offset, int len) {
        sb.append(str);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(boolean b) {
        sb.append(b);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(char c) {
        sb.append(c);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }


    public StringBuilderNotifier append(int i) {
        sb.append(i);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(long lng) {
        sb.append(lng);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(float f) {
        sb.append(f);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier append(double d) {
        sb.append(d);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier appendCodePoint(int codePoint) {
        sb.appendCodePoint(codePoint);
        actionManager.notifyActionListeners(StringBuilderAction.APPENDCODEPOINT);
        return this;
    }

    public StringBuilderNotifier delete(int start, int end) {
        String deleted = sb.substring(start, end);
        sb.delete(start, end);
        actionManager.notifyActionListeners(StringBuilderAction.DELETE);
        return this;
    }

    public StringBuilderNotifier deleteCharAt(int index) {
        char deleted = sb.charAt(index);
        sb.deleteCharAt(index);
        actionManager.notifyActionListeners(StringBuilderAction.DELETECHARAT);
        return this;
    }

    public StringBuilderNotifier replace(int start, int end, String str) {
        String deleted = sb.substring(start, end);
        sb.replace(start, end, str);
        actionManager.notifyActionListeners(StringBuilderAction.REPLACE);
        return this;
    }

    public StringBuilderNotifier insert(int index, char[] str, int offset, int len) {
        sb.insert(index, str, offset, len);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, Object obj) {
        sb.insert(offset, obj);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }


    public StringBuilderNotifier insert(int offset, String str) {
        sb.insert(offset, str);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }


    public StringBuilderNotifier insert(int offset, char[] str) {
        sb.insert(offset, str);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int dstOffset, CharSequence s,
                                    int start, int end) {
        sb.insert(dstOffset, s, start, end);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, boolean b) {
        sb.insert(offset, b);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, char c) {
        sb.insert(offset, c);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, int i) {
        sb.insert(offset, i);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, long l) {
        sb.insert(offset, l);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, float f) {
        sb.insert(offset, f);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public StringBuilderNotifier insert(int offset, double d) {
        sb.insert(offset, d);
        actionManager.notifyActionListeners(StringBuilderAction.INSERT);
        return this;
    }

    public int indexOf(String str) {
        return sb.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return sb.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }

    public StringBuilderNotifier reverse() {
        sb.reverse();
        actionManager.notifyActionListeners(StringBuilderAction.REVERSE);
        return this;
    }

    public String toString() {
        return sb.toString();
    }
}
