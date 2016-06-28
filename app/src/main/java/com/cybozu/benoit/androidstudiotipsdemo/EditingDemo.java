package com.cybozu.benoit.androidstudiotipsdemo;

/**
 * Created by benoit-quenaudon on 6/28/16.
 *
 * Reference:
 *   The experts' guide to Android development tools
 *   https://www.youtube.com/watch?v=hHnTIMjd1Y8
 */

import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 0.- General tips
 *
 * Tools -> Create command line launcher
 * Help -> Edit custom VM options
 * Alt-F1 -> Enter
 */
@SuppressWarnings("unused")
public class EditingDemo {

    private static final String TAG = "EditingDemo";
    private static final String CONSTANT = "Cybozu";

    private ArrayList mArrayList;

    /**
     * 1.- アクセスサーチ
     * すべてのコマンドを検索できるダイアログ
     *
     * Mac: Cmd+Shift+A
     * Win: Ctrl+Shift+A
     */

    /**
     * 2.- Smart Join: Ctrl+Shift+J
     * 文字列を連結する
     *
     * @return the constant string
     */
    public String getDescription() {
        final String desc = "この" +
                "とても" +
                "良い" +
                "説明文は";
        return desc + " TAG: " + TAG + ", CONSTANT: " + CONSTANT + " を含めている。";
    }

    /**
     * 3.- Completion: Enter 対 Tab
     */
    public boolean completion(String first, String second) {
        return first.contains(second);
    }

    /**
     * 4.- instanceof ArrayList
     *
     * "." は型の関数を提供し、キャストもする
     * Alt-Enter: Insert (cast) declaration
     */
    public void setArrayList(Object o) {
        if (o instanceof ArrayList) {

        }
    }

    /**
     * 5.- Multicursor
     *
     * Select Next: Ctrl-G
     * Skip:
     *   Mac: Cmd+G
     *   Win: F3
     * テンプレートも利用可能
     * 複数のクリップボード
     * Cmd+Shift+A: すべてが適用される
     */
    public void logUsers() {
        // User: Yuki Okada
        // User: Yasuharu Sakai
        // User: Benoit Quenaudon
        // User: Kaiichiro Ota
        // User: Ryo Mitoma
        // User: Ken Santou
    }

    /**
     * 6.- ナビゲーション
     * Cmd+F12 Navigate
     * ほぼどのダイアログでも書き出すと検索できる
     *
     * ラインをブックマーク:
     *   Mac: F3
     *   Win: F11
     *
     * 数字にブックマーク
     * 0 に登録: Ctrl+Shift+0
     * 1 に登録: Ctrl+Shift+1
     *
     * Goto 0..9: Ctrl-0..9
     *
     * 文字にブックマーク:
     * A に登録:
     *   Mac: Alt+F3 -> A
     *   Win: Ctrl+F11 -> A
     * B に登録:
     *   Mac: Alt+F3 -> B
     *   Win: Ctrl+F11 -> B
     */

    /**
     * 7.- メソッド抽出
     *
     * 簡単な選択:
     *   Mac: Alt+Up (Alt+Down)
     *   Win: Ctrl+W (Ctrl+Shift+W)
     * 抽出:
     *   Mac: Cmd+Alt+M
     *   Win: Cmd+Shift+A -> Extract Method
     */
    public void Values() {
        List<Integer> even = new LinkedList<>();
        List<Integer> odd = new LinkedList<>();

        int mod = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == mod) {
                even.add(i);
            }
        }
        mod = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == mod) {
                odd.add(i);
            }
        }
    }

    /**
     * 8.- ポストフィックステンプレート
     *
     * Mac: Cmd+J
     * Win: Ctrl+J
     */
    public void postfix() {
        int[] ints = {1, 2, 3, 4};
        //ints.forr

        Object o = new Object();
        // o.nn
    }

    /**
     * 9.- Intentで条件を整理する
     *
     * Intent:
     *   Mac: Alt+Enter
     *   Win:
     */
    public void conditions(boolean a, boolean b, boolean c, boolean d) {
        if (!(!(c || d) || !(a || b))) {
            Log.d(TAG, "(c || d) && (a || b) is true!");
        }
    }

    /**
     * 10.- Ctrl-Space 対 Ctrl-Shift-Space (賢い)
     */
    public ArrayList getArrayList() {
        return null;
    }
    private ArrayList createArrayList() { return null; }

    /**
     * 11.- ロケールヒストリー
     *
     * Mac: Cmd+Shift+A -> Show History
     * Win: Ctrl+Shift+A -> Show History
     */
}