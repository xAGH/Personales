
namespace Cotizaciones
{
    partial class CotizacionesForm
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CotizacionesForm));
            this.NombreLabel = new System.Windows.Forms.Label();
            this.NombreTextBox = new System.Windows.Forms.TextBox();
            this.ValorLabel = new System.Windows.Forms.Label();
            this.ValorTextBox = new System.Windows.Forms.TextBox();
            this.SeguroGroupBox = new System.Windows.Forms.GroupBox();
            this.NingunoRadioButton = new System.Windows.Forms.RadioButton();
            this.TotalRadioButton = new System.Windows.Forms.RadioButton();
            this.TercerosRadioButton = new System.Windows.Forms.RadioButton();
            this.BasicoRadioButton = new System.Windows.Forms.RadioButton();
            this.EquipamientoGroupBox = new System.Windows.Forms.GroupBox();
            this.AudioCheckBox = new System.Windows.Forms.CheckBox();
            this.AireAcondicionadoCheckBox = new System.Windows.Forms.CheckBox();
            this.ResultadoTextBox = new System.Windows.Forms.TextBox();
            this.CotizarButton = new System.Windows.Forms.Button();
            this.SalirButton = new System.Windows.Forms.Button();
            this.SeguroGroupBox.SuspendLayout();
            this.EquipamientoGroupBox.SuspendLayout();
            this.SuspendLayout();
            // 
            // NombreLabel
            // 
            this.NombreLabel.AutoSize = true;
            this.NombreLabel.Font = new System.Drawing.Font("Verdana", 9F, System.Drawing.FontStyle.Bold);
            this.NombreLabel.Location = new System.Drawing.Point(12, 25);
            this.NombreLabel.Name = "NombreLabel";
            this.NombreLabel.Size = new System.Drawing.Size(59, 14);
            this.NombreLabel.TabIndex = 0;
            this.NombreLabel.Text = "Nombre";
            // 
            // NombreTextBox
            // 
            this.NombreTextBox.Font = new System.Drawing.Font("Verdana", 9F);
            this.NombreTextBox.ForeColor = System.Drawing.SystemColors.WindowText;
            this.NombreTextBox.Location = new System.Drawing.Point(71, 22);
            this.NombreTextBox.Name = "NombreTextBox";
            this.NombreTextBox.Size = new System.Drawing.Size(193, 22);
            this.NombreTextBox.TabIndex = 1;
            this.NombreTextBox.TextChanged += new System.EventHandler(this.TextBox_Changed);
            this.NombreTextBox.Enter += new System.EventHandler(this.TextBox_Enter);
            this.NombreTextBox.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // ValorLabel
            // 
            this.ValorLabel.AutoSize = true;
            this.ValorLabel.Font = new System.Drawing.Font("Verdana", 9F, System.Drawing.FontStyle.Bold);
            this.ValorLabel.Location = new System.Drawing.Point(290, 25);
            this.ValorLabel.Name = "ValorLabel";
            this.ValorLabel.Size = new System.Drawing.Size(42, 14);
            this.ValorLabel.TabIndex = 2;
            this.ValorLabel.Text = "Valor";
            // 
            // ValorTextBox
            // 
            this.ValorTextBox.Font = new System.Drawing.Font("Verdana", 9F);
            this.ValorTextBox.Location = new System.Drawing.Point(331, 22);
            this.ValorTextBox.Name = "ValorTextBox";
            this.ValorTextBox.Size = new System.Drawing.Size(207, 22);
            this.ValorTextBox.TabIndex = 3;
            this.ValorTextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            this.ValorTextBox.TextChanged += new System.EventHandler(this.TextBox_Changed);
            this.ValorTextBox.Enter += new System.EventHandler(this.TextBox_Enter);
            this.ValorTextBox.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // SeguroGroupBox
            // 
            this.SeguroGroupBox.Controls.Add(this.NingunoRadioButton);
            this.SeguroGroupBox.Controls.Add(this.TotalRadioButton);
            this.SeguroGroupBox.Controls.Add(this.TercerosRadioButton);
            this.SeguroGroupBox.Controls.Add(this.BasicoRadioButton);
            this.SeguroGroupBox.Font = new System.Drawing.Font("Verdana", 9F, System.Drawing.FontStyle.Bold);
            this.SeguroGroupBox.Location = new System.Drawing.Point(15, 87);
            this.SeguroGroupBox.Name = "SeguroGroupBox";
            this.SeguroGroupBox.Size = new System.Drawing.Size(204, 131);
            this.SeguroGroupBox.TabIndex = 5;
            this.SeguroGroupBox.TabStop = false;
            this.SeguroGroupBox.Text = "Seguro a seleccionar";
            // 
            // NingunoRadioButton
            // 
            this.NingunoRadioButton.AutoSize = true;
            this.NingunoRadioButton.Checked = true;
            this.NingunoRadioButton.Location = new System.Drawing.Point(7, 21);
            this.NingunoRadioButton.Name = "NingunoRadioButton";
            this.NingunoRadioButton.Size = new System.Drawing.Size(79, 18);
            this.NingunoRadioButton.TabIndex = 3;
            this.NingunoRadioButton.TabStop = true;
            this.NingunoRadioButton.Text = "Ninguno";
            this.NingunoRadioButton.UseVisualStyleBackColor = true;
            this.NingunoRadioButton.CheckedChanged += new System.EventHandler(this.RadioButton_CheckedChanged);
            // 
            // TotalRadioButton
            // 
            this.TotalRadioButton.AutoSize = true;
            this.TotalRadioButton.Location = new System.Drawing.Point(7, 93);
            this.TotalRadioButton.Name = "TotalRadioButton";
            this.TotalRadioButton.Size = new System.Drawing.Size(58, 18);
            this.TotalRadioButton.TabIndex = 2;
            this.TotalRadioButton.Text = "Total";
            this.TotalRadioButton.UseVisualStyleBackColor = true;
            this.TotalRadioButton.CheckedChanged += new System.EventHandler(this.RadioButton_CheckedChanged);
            // 
            // TercerosRadioButton
            // 
            this.TercerosRadioButton.AutoSize = true;
            this.TercerosRadioButton.Location = new System.Drawing.Point(7, 69);
            this.TercerosRadioButton.Name = "TercerosRadioButton";
            this.TercerosRadioButton.Size = new System.Drawing.Size(83, 18);
            this.TercerosRadioButton.TabIndex = 1;
            this.TercerosRadioButton.Text = "Terceros";
            this.TercerosRadioButton.UseVisualStyleBackColor = true;
            this.TercerosRadioButton.CheckedChanged += new System.EventHandler(this.RadioButton_CheckedChanged);
            // 
            // BasicoRadioButton
            // 
            this.BasicoRadioButton.AutoSize = true;
            this.BasicoRadioButton.Location = new System.Drawing.Point(7, 44);
            this.BasicoRadioButton.Name = "BasicoRadioButton";
            this.BasicoRadioButton.Size = new System.Drawing.Size(68, 18);
            this.BasicoRadioButton.TabIndex = 0;
            this.BasicoRadioButton.Text = "Básico";
            this.BasicoRadioButton.UseVisualStyleBackColor = true;
            this.BasicoRadioButton.CheckedChanged += new System.EventHandler(this.RadioButton_CheckedChanged);
            // 
            // EquipamientoGroupBox
            // 
            this.EquipamientoGroupBox.Controls.Add(this.AudioCheckBox);
            this.EquipamientoGroupBox.Controls.Add(this.AireAcondicionadoCheckBox);
            this.EquipamientoGroupBox.Font = new System.Drawing.Font("Verdana", 9F, System.Drawing.FontStyle.Bold);
            this.EquipamientoGroupBox.Location = new System.Drawing.Point(293, 87);
            this.EquipamientoGroupBox.Name = "EquipamientoGroupBox";
            this.EquipamientoGroupBox.Size = new System.Drawing.Size(220, 72);
            this.EquipamientoGroupBox.TabIndex = 6;
            this.EquipamientoGroupBox.TabStop = false;
            this.EquipamientoGroupBox.Text = "Equipamiento";
            // 
            // AudioCheckBox
            // 
            this.AudioCheckBox.AutoSize = true;
            this.AudioCheckBox.Location = new System.Drawing.Point(6, 45);
            this.AudioCheckBox.Name = "AudioCheckBox";
            this.AudioCheckBox.Size = new System.Drawing.Size(63, 18);
            this.AudioCheckBox.TabIndex = 1;
            this.AudioCheckBox.Text = "Audio";
            this.AudioCheckBox.UseVisualStyleBackColor = true;
            this.AudioCheckBox.CheckedChanged += new System.EventHandler(this.AudioCheckBox_CheckedChange);
            // 
            // AireAcondicionadoCheckBox
            // 
            this.AireAcondicionadoCheckBox.AutoSize = true;
            this.AireAcondicionadoCheckBox.Location = new System.Drawing.Point(6, 21);
            this.AireAcondicionadoCheckBox.Name = "AireAcondicionadoCheckBox";
            this.AireAcondicionadoCheckBox.Size = new System.Drawing.Size(152, 18);
            this.AireAcondicionadoCheckBox.TabIndex = 0;
            this.AireAcondicionadoCheckBox.Text = "Aire Acondicionado";
            this.AireAcondicionadoCheckBox.UseVisualStyleBackColor = true;
            this.AireAcondicionadoCheckBox.CheckedChanged += new System.EventHandler(this.AireAcondicionadoCheckBox_CheckedChange);
            // 
            // ResultadoTextBox
            // 
            this.ResultadoTextBox.Font = new System.Drawing.Font("Verdana", 9F);
            this.ResultadoTextBox.Location = new System.Drawing.Point(15, 244);
            this.ResultadoTextBox.Multiline = true;
            this.ResultadoTextBox.Name = "ResultadoTextBox";
            this.ResultadoTextBox.ReadOnly = true;
            this.ResultadoTextBox.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.ResultadoTextBox.Size = new System.Drawing.Size(519, 115);
            this.ResultadoTextBox.TabIndex = 7;
            this.ResultadoTextBox.Enter += new System.EventHandler(this.TextBox_Enter);
            this.ResultadoTextBox.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // CotizarButton
            // 
            this.CotizarButton.BackColor = System.Drawing.Color.Honeydew;
            this.CotizarButton.Cursor = System.Windows.Forms.Cursors.Hand;
            this.CotizarButton.Enabled = false;
            this.CotizarButton.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.CotizarButton.FlatAppearance.MouseDownBackColor = System.Drawing.Color.GreenYellow;
            this.CotizarButton.FlatAppearance.MouseOverBackColor = System.Drawing.Color.GreenYellow;
            this.CotizarButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.CotizarButton.Font = new System.Drawing.Font("Verdana", 10F, System.Drawing.FontStyle.Bold);
            this.CotizarButton.Location = new System.Drawing.Point(293, 171);
            this.CotizarButton.Name = "CotizarButton";
            this.CotizarButton.Size = new System.Drawing.Size(220, 27);
            this.CotizarButton.TabIndex = 8;
            this.CotizarButton.Text = "&Cotizar";
            this.CotizarButton.UseVisualStyleBackColor = false;
            this.CotizarButton.MouseClick += new System.Windows.Forms.MouseEventHandler(this.CotizarButton_MouseClick);
            // 
            // SalirButton
            // 
            this.SalirButton.BackColor = System.Drawing.Color.Red;
            this.SalirButton.Cursor = System.Windows.Forms.Cursors.Hand;
            this.SalirButton.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.SalirButton.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red;
            this.SalirButton.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red;
            this.SalirButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.SalirButton.Font = new System.Drawing.Font("Verdana", 10F, System.Drawing.FontStyle.Bold);
            this.SalirButton.ForeColor = System.Drawing.SystemColors.ButtonFace;
            this.SalirButton.Location = new System.Drawing.Point(463, 365);
            this.SalirButton.Name = "SalirButton";
            this.SalirButton.Size = new System.Drawing.Size(75, 27);
            this.SalirButton.TabIndex = 9;
            this.SalirButton.Text = "&Salir";
            this.SalirButton.UseVisualStyleBackColor = false;
            this.SalirButton.MouseClick += new System.Windows.Forms.MouseEventHandler(this.SalirButton_MouseClick);
            // 
            // CotizacionesForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(546, 404);
            this.Controls.Add(this.SalirButton);
            this.Controls.Add(this.CotizarButton);
            this.Controls.Add(this.ResultadoTextBox);
            this.Controls.Add(this.EquipamientoGroupBox);
            this.Controls.Add(this.SeguroGroupBox);
            this.Controls.Add(this.ValorTextBox);
            this.Controls.Add(this.ValorLabel);
            this.Controls.Add(this.NombreTextBox);
            this.Controls.Add(this.NombreLabel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "CotizacionesForm";
            this.Text = "Cotizaciones ADSI";
            this.SeguroGroupBox.ResumeLayout(false);
            this.SeguroGroupBox.PerformLayout();
            this.EquipamientoGroupBox.ResumeLayout(false);
            this.EquipamientoGroupBox.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label NombreLabel;
        private System.Windows.Forms.TextBox NombreTextBox;
        private System.Windows.Forms.Label ValorLabel;
        private System.Windows.Forms.TextBox ValorTextBox;
        private System.Windows.Forms.GroupBox SeguroGroupBox;
        private System.Windows.Forms.GroupBox EquipamientoGroupBox;
        private System.Windows.Forms.CheckBox AudioCheckBox;
        private System.Windows.Forms.CheckBox AireAcondicionadoCheckBox;
        private System.Windows.Forms.RadioButton TotalRadioButton;
        private System.Windows.Forms.RadioButton TercerosRadioButton;
        private System.Windows.Forms.RadioButton BasicoRadioButton;
        private System.Windows.Forms.TextBox ResultadoTextBox;
        private System.Windows.Forms.Button CotizarButton;
        private System.Windows.Forms.Button SalirButton;
        private System.Windows.Forms.RadioButton NingunoRadioButton;
    }
}

