package io.electrum.vas.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.electrum.vas.Utils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A line of text to be printed on the till slip
 *
 */
@ApiModel(description = "A line of text to be printed on the till slip")
public class SlipLine {

   private Barcode barcode;
   private String text;
   private double fontWidthScaleFactor = 1;
   private double fontHeightScaleFactor = 1;
   private boolean line = false;
   private boolean cut = false;

   public SlipLine barcode(Barcode barcode) {
      this.barcode = barcode;
      return this;
   }

   /**
    * Barcode information for this line
    *
    * @return barcode
    */
   @ApiModelProperty(value = "Barcode information for this line")
   @Valid
   public Barcode getBarcode() {
      return barcode;
   }

   public void setBarcode(Barcode barcode) {
      this.barcode = barcode;
   }

   public SlipLine text(String text) {
      this.text = text;
      return this;
   }

   /**
    * Text contained on the line
    * 
    * @return text
    */
   @ApiModelProperty(required = true, value = "Text contained on the line")
   @NotNull
   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public SlipLine fontWidthScaleFactor(double fontWidthScaleFactor) {
      this.fontWidthScaleFactor = fontWidthScaleFactor;
      return this;
   }

   /**
    * Scale factor for font width. Assume 1.0 (i.e. normal size) if not present.
    * 
    * @return fontWidthScaleFactor
    */
   @ApiModelProperty(value = "Scale factor for font width. Assume 1.0 (i.e. normal size) if not present.")
   public double getFontWidthScaleFactor() {
      return fontWidthScaleFactor;
   }

   public void setFontWidthScaleFactor(double fontWidthScaleFactor) {
      this.fontWidthScaleFactor = fontWidthScaleFactor;
   }

   public SlipLine fontHeightScaleFactor(double fontHeightScaleFactor) {
      this.fontHeightScaleFactor = fontHeightScaleFactor;
      return this;
   }

   /**
    * Scale factor for font height. Assume 1.0 (i.e. normal size) if not present.
    * 
    * @return fontHeightScaleFactor
    */
   @ApiModelProperty(value = "Scale factor for font height. Assume 1.0 (i.e. normal size) if not present.")
   public double getFontHeightScaleFactor() {
      return fontHeightScaleFactor;
   }

   public void setFontHeightScaleFactor(double fontHeightScaleFactor) {
      this.fontHeightScaleFactor = fontHeightScaleFactor;
   }

   public SlipLine line(boolean line) {
      this.line = line;
      return this;
   }

   /**
    * Denotes a solid line on the slip. Assume false if not present.
    * 
    * @return line
    */
   @ApiModelProperty(value = "Denotes a solid line on the slip. Assume false if not present.")
   public boolean getLine() {
      return line;
   }

   public void setLine(boolean line) {
      this.line = line;
   }

   public SlipLine cut(boolean cut) {
      this.cut = cut;
      return this;
   }

   /**
    * Indicates the slip should be cut at this line. Assume false if not present.
    * 
    * @return cut
    */
   @ApiModelProperty(value = "Indicates the slip should be cut at this line. Assume false if not present.")
   public boolean getCut() {
      return cut;
   }

   public void setCut(boolean cut) {
      this.cut = cut;
   }

   @Override
   public boolean equals(java.lang.Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      SlipLine printableLine = (SlipLine) o;
      return Objects.equals(this.text, printableLine.text)
            && Objects.equals(this.fontWidthScaleFactor, printableLine.fontWidthScaleFactor)
            && Objects.equals(this.fontHeightScaleFactor, printableLine.fontHeightScaleFactor)
            && Objects.equals(this.line, printableLine.line) && Objects.equals(this.cut, printableLine.cut)
            && Objects.equals(this.barcode, printableLine.barcode);
   }

   @Override
   public int hashCode() {
      return Objects.hash(text, fontWidthScaleFactor, fontHeightScaleFactor, line, cut, barcode);
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SlipLine {\n");

      sb.append("    text: ").append(Utils.toIndentedString(text)).append("\n");
      sb.append("    fontWidthScaleFactor: ").append(Utils.toIndentedString(fontWidthScaleFactor)).append("\n");
      sb.append("    fontHeightScaleFactor: ").append(Utils.toIndentedString(fontHeightScaleFactor)).append("\n");
      sb.append("    line: ").append(Utils.toIndentedString(line)).append("\n");
      sb.append("    cut: ").append(Utils.toIndentedString(cut)).append("\n");
      sb.append("    barcode: ").append(Utils.toIndentedString(barcode)).append("\n");
      sb.append("}");
      return sb.toString();
   }
}
