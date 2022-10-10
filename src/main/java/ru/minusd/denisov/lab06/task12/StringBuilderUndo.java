package ru.minusd.denisov.lab06.task12;

import java.util.Stack;

public class StringBuilderUndo {
    private StringBuilder sb;
    private Stack<UndoCommand> commands = new Stack<>();

    public StringBuilderUndo() {
        sb = new StringBuilder();
    }

    public StringBuilderUndo(int capacity) {
        sb = new StringBuilder(capacity);
    }

    public StringBuilderUndo(String str) {
        sb = new StringBuilder(str);
    }

    public StringBuilderUndo(CharSequence seq) {
        sb = new StringBuilder(seq);
    }

    private StringBuilder getStringBuilder() {
        return sb;
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        }
    }

    public int compareTo(StringBuilderUndo another) {
        return sb.compareTo(another.getStringBuilder());
    }

    public StringBuilderUndo append(Object obj) {
        sb.append(obj);
        commands.push(() -> sb.delete(sb.length() - obj.toString().length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(String str) {
        sb.append(str);
        commands.push(() -> sb.delete(sb.length() - str.length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(StringBuffer sb) {
        this.sb.append(sb);
        commands.push(() -> this.sb.delete(sb.length() - sb.toString().length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(CharSequence s) {
        sb.append(s);
        commands.push(() -> sb.delete(sb.length() - s.length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(CharSequence s, int start, int end) {
        sb.append(s);
        commands.push(() -> sb.delete(sb.length() - s.length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(char[] str) {
        sb.append(str);
        commands.push(() -> sb.delete(sb.length() - str.length, sb.length()));
        return this;
    }

    public StringBuilderUndo append(char[] str, int offset, int len) {
        sb.append(str);
        commands.push(() -> sb.delete(sb.length() - len, sb.length()));
        return this;
    }

    public StringBuilderUndo append(boolean b) {
        sb.append(b);
        commands.push(() -> sb.delete(sb.length() - Boolean.toString(b).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(char c) {
        sb.append(c);
        commands.push(() -> sb.delete(sb.length() - 1, sb.length()));
        return this;
    }


    public StringBuilderUndo append(int i) {
        sb.append(i);
        commands.push(() -> sb.delete(sb.length() - Integer.toString(i).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(long lng) {
        sb.append(lng);
        commands.push(() -> sb.delete(sb.length() - Long.toString(lng).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(float f) {
        sb.append(f);
        commands.push(() -> sb.delete(sb.length() - Float.toString(f).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo append(double d) {
        sb.append(d);
        commands.push(() -> sb.delete(sb.length() - Double.toString(d).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo appendCodePoint(int codePoint) {
        sb.appendCodePoint(codePoint);
        commands.push(() -> sb.delete(sb.length() - String.valueOf(codePoint).length(), sb.length()));
        return this;
    }

    public StringBuilderUndo delete(int start, int end) {
        String deleted = sb.substring(start, end);
        sb.delete(start, end);
        commands.push(() -> sb.insert(start, deleted));
        return this;
    }

    public StringBuilderUndo deleteCharAt(int index) {
        char deleted = sb.charAt(index);
        sb.deleteCharAt(index);
        commands.push(() -> sb.insert(index, deleted));
        return this;
    }

    public StringBuilderUndo replace(int start, int end, String str) {
        String deleted = sb.substring(start, end);
        sb.replace(start, end, str);
        commands.push(() -> sb.replace(start, end, deleted));
        return this;
    }

    public StringBuilderUndo insert(int index, char[] str, int offset, int len) {
        sb.insert(index, str, offset, len);
        commands.push(() -> sb.delete(index, len));
        return this;
    }

    public StringBuilderUndo insert(int offset, Object obj) {
        sb.insert(offset, obj);
        commands.push(() -> sb.delete(offset, obj.toString().length()));
        return this;
    }


    public StringBuilderUndo insert(int offset, String str) {
        sb.insert(offset, str);
        commands.push(() -> sb.delete(offset, str.length()));
        return this;
    }


    public StringBuilderUndo insert(int offset, char[] str) {
        sb.insert(offset, str);
        commands.push(() -> sb.delete(offset, str.length));
        return this;
    }

    public StringBuilderUndo insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        commands.push(() -> sb.delete(dstOffset, s.length()));
        return this;
    }

    public StringBuilderUndo insert(int dstOffset, CharSequence s,
                                    int start, int end) {
        sb.insert(dstOffset, s, start, end);
        commands.push(() -> sb.delete(sb.length() - (start - end), sb.length()));
        return this;
    }

    public StringBuilderUndo insert(int offset, boolean b) {
        sb.insert(offset, b);
        commands.push(() -> sb.delete(offset, Boolean.toString(b).length()));
        return this;
    }

    public StringBuilderUndo insert(int offset, char c) {
        sb.insert(offset, c);
        commands.push(() -> sb.delete(offset, 1));
        return this;
    }

    public StringBuilderUndo insert(int offset, int i) {
        sb.insert(offset, i);
        commands.push(() -> sb.delete(offset, Integer.toString(i).length()));
        return this;
    }

    public StringBuilderUndo insert(int offset, long l) {
        sb.insert(offset, l);
        commands.push(() -> sb.delete(offset, Long.toString(l).length()));
        return this;
    }

    public StringBuilderUndo insert(int offset, float f) {
        sb.insert(offset, f);
        commands.push(() -> sb.delete(offset, Float.toString(f).length()));
        return this;
    }

    public StringBuilderUndo insert(int offset, double d) {
        sb.insert(offset, d);
        commands.push(() -> sb.delete(offset, Double.toString(d).length()));
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

    public StringBuilderUndo reverse() {
        sb.reverse();
        commands.push(() -> sb.reverse());
        return this;
    }

    public String toString() {
        return sb.toString();
    }
}