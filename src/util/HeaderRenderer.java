/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.plaf.UIResource;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author taiproduaxe
 */
public class HeaderRenderer implements UIResource, TableCellRenderer {

    private TableCellRenderer original;

    public HeaderRenderer(TableCellRenderer original) {
        this.original = original;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,
                                                                                                 Object value, boolean isSelected, boolean hasFocus, int row,
                                                                                                 int column) {
        Component comp = original.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        comp.setFont(comp.getFont().deriveFont(Font.BOLD));
        return comp;
    }

}
