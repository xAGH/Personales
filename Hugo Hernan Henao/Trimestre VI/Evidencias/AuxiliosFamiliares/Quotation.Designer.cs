
namespace AuxiliosFamiliares
{
    partial class QuotationWindow
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(QuotationWindow));
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.opcionesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuCalculate = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripNew = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripSeparator();
            this.ToolStripMenuExit = new System.Windows.Forms.ToolStripMenuItem();
            this.labelName = new System.Windows.Forms.Label();
            this.textBoxName = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.numericUpDownSons = new System.Windows.Forms.NumericUpDown();
            this.labelSalary = new System.Windows.Forms.Label();
            this.textBoxSalary = new System.Windows.Forms.TextBox();
            this.checkBoxSyndicateMember = new System.Windows.Forms.CheckBox();
            this.checkBoxGreeting = new System.Windows.Forms.CheckBox();
            this.groupBoxGender = new System.Windows.Forms.GroupBox();
            this.radioButtonTrans = new System.Windows.Forms.RadioButton();
            this.radioButtonFemenine = new System.Windows.Forms.RadioButton();
            this.radioButtonMasculine = new System.Windows.Forms.RadioButton();
            this.buttonCalculate = new System.Windows.Forms.Button();
            this.groupBoxResult = new System.Windows.Forms.GroupBox();
            this.labelResult = new System.Windows.Forms.Label();
            this.buttonExit = new System.Windows.Forms.Button();
            this.buttonNew = new System.Windows.Forms.Button();
            this.labelCurrency = new System.Windows.Forms.Label();
            this.menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownSons)).BeginInit();
            this.groupBoxGender.SuspendLayout();
            this.groupBoxResult.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.opcionesToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.RenderMode = System.Windows.Forms.ToolStripRenderMode.Professional;
            this.menuStrip1.Size = new System.Drawing.Size(203, 25);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // opcionesToolStripMenuItem
            // 
            this.opcionesToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuCalculate,
            this.toolStripNew,
            this.toolStripMenuItem2,
            this.ToolStripMenuExit});
            this.opcionesToolStripMenuItem.Font = new System.Drawing.Font("Segoe UI", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.opcionesToolStripMenuItem.Name = "opcionesToolStripMenuItem";
            this.opcionesToolStripMenuItem.Size = new System.Drawing.Size(75, 21);
            this.opcionesToolStripMenuItem.Text = "Opciones";
            // 
            // toolStripMenuCalculate
            // 
            this.toolStripMenuCalculate.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripMenuCalculate.Name = "toolStripMenuCalculate";
            this.toolStripMenuCalculate.Size = new System.Drawing.Size(180, 22);
            this.toolStripMenuCalculate.Text = "Calcular";
            this.toolStripMenuCalculate.Click += new System.EventHandler(this.ToolStripMenu_Click);
            // 
            // toolStripNew
            // 
            this.toolStripNew.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripNew.Name = "toolStripNew";
            this.toolStripNew.Size = new System.Drawing.Size(180, 22);
            this.toolStripNew.Text = "Nuevo";
            this.toolStripNew.Click += new System.EventHandler(this.ToolStripMenu_Click);
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripMenuItem2.ForeColor = System.Drawing.SystemColors.Control;
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(177, 6);
            // 
            // ToolStripMenuExit
            // 
            this.ToolStripMenuExit.BackColor = System.Drawing.SystemColors.Control;
            this.ToolStripMenuExit.Name = "ToolStripMenuExit";
            this.ToolStripMenuExit.Size = new System.Drawing.Size(180, 22);
            this.ToolStripMenuExit.Text = "Salir";
            this.ToolStripMenuExit.Click += new System.EventHandler(this.ButtonExit_Click);
            // 
            // labelName
            // 
            this.labelName.AutoSize = true;
            this.labelName.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelName.Location = new System.Drawing.Point(12, 88);
            this.labelName.Name = "labelName";
            this.labelName.Size = new System.Drawing.Size(169, 21);
            this.labelName.TabIndex = 2;
            this.labelName.Text = "Nombre del empleado:";
            // 
            // textBoxName
            // 
            this.textBoxName.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxName.Location = new System.Drawing.Point(187, 85);
            this.textBoxName.Name = "textBoxName";
            this.textBoxName.Size = new System.Drawing.Size(248, 29);
            this.textBoxName.TabIndex = 4;
            this.textBoxName.TextChanged += new System.EventHandler(this.TextBox_TextChanged);
            this.textBoxName.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Enter_KeyPress);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 144);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(130, 21);
            this.label1.TabIndex = 5;
            this.label1.Text = "Cantidad de hijos";
            // 
            // numericUpDownSons
            // 
            this.numericUpDownSons.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.numericUpDownSons.Location = new System.Drawing.Point(238, 142);
            this.numericUpDownSons.Maximum = new decimal(new int[] {
            10,
            0,
            0,
            0});
            this.numericUpDownSons.Name = "numericUpDownSons";
            this.numericUpDownSons.Size = new System.Drawing.Size(130, 29);
            this.numericUpDownSons.TabIndex = 1;
            this.numericUpDownSons.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            this.numericUpDownSons.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Enter_KeyPress);
            // 
            // labelSalary
            // 
            this.labelSalary.AutoSize = true;
            this.labelSalary.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelSalary.Location = new System.Drawing.Point(12, 200);
            this.labelSalary.Name = "labelSalary";
            this.labelSalary.Size = new System.Drawing.Size(106, 21);
            this.labelSalary.TabIndex = 6;
            this.labelSalary.Text = "Salario básico";
            // 
            // textBoxSalary
            // 
            this.textBoxSalary.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxSalary.Location = new System.Drawing.Point(187, 197);
            this.textBoxSalary.Name = "textBoxSalary";
            this.textBoxSalary.Size = new System.Drawing.Size(248, 29);
            this.textBoxSalary.TabIndex = 7;
            this.textBoxSalary.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            this.textBoxSalary.TextChanged += new System.EventHandler(this.TextBox_TextChanged);
            this.textBoxSalary.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.TextBoxSalary_KeyPress);
            // 
            // checkBoxSyndicateMember
            // 
            this.checkBoxSyndicateMember.AutoSize = true;
            this.checkBoxSyndicateMember.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.checkBoxSyndicateMember.Location = new System.Drawing.Point(12, 242);
            this.checkBoxSyndicateMember.Name = "checkBoxSyndicateMember";
            this.checkBoxSyndicateMember.Size = new System.Drawing.Size(228, 25);
            this.checkBoxSyndicateMember.TabIndex = 8;
            this.checkBoxSyndicateMember.Text = "No es miembro del sindicato";
            this.checkBoxSyndicateMember.UseVisualStyleBackColor = true;
            this.checkBoxSyndicateMember.CheckedChanged += new System.EventHandler(this.CheckBoxSyndicateMember_CheckedChanged);
            // 
            // checkBoxGreeting
            // 
            this.checkBoxGreeting.AutoSize = true;
            this.checkBoxGreeting.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.checkBoxGreeting.Location = new System.Drawing.Point(12, 273);
            this.checkBoxGreeting.Name = "checkBoxGreeting";
            this.checkBoxGreeting.Size = new System.Drawing.Size(77, 25);
            this.checkBoxGreeting.TabIndex = 10;
            this.checkBoxGreeting.Text = "Saludo";
            this.checkBoxGreeting.UseVisualStyleBackColor = true;
            this.checkBoxGreeting.CheckedChanged += new System.EventHandler(this.CheckBoxGreeting_CheckedChanged);
            // 
            // groupBoxGender
            // 
            this.groupBoxGender.Controls.Add(this.radioButtonTrans);
            this.groupBoxGender.Controls.Add(this.radioButtonFemenine);
            this.groupBoxGender.Controls.Add(this.radioButtonMasculine);
            this.groupBoxGender.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBoxGender.Location = new System.Drawing.Point(16, 304);
            this.groupBoxGender.Name = "groupBoxGender";
            this.groupBoxGender.Size = new System.Drawing.Size(152, 69);
            this.groupBoxGender.TabIndex = 11;
            this.groupBoxGender.TabStop = false;
            this.groupBoxGender.Text = "Sexo";
            this.groupBoxGender.Visible = false;
            // 
            // radioButtonTrans
            // 
            this.radioButtonTrans.AutoSize = true;
            this.radioButtonTrans.Location = new System.Drawing.Point(100, 28);
            this.radioButtonTrans.Name = "radioButtonTrans";
            this.radioButtonTrans.Size = new System.Drawing.Size(36, 25);
            this.radioButtonTrans.TabIndex = 2;
            this.radioButtonTrans.TabStop = true;
            this.radioButtonTrans.Text = "T";
            this.radioButtonTrans.UseVisualStyleBackColor = true;
            // 
            // radioButtonFemenine
            // 
            this.radioButtonFemenine.AutoSize = true;
            this.radioButtonFemenine.Location = new System.Drawing.Point(53, 28);
            this.radioButtonFemenine.Name = "radioButtonFemenine";
            this.radioButtonFemenine.Size = new System.Drawing.Size(36, 25);
            this.radioButtonFemenine.TabIndex = 1;
            this.radioButtonFemenine.TabStop = true;
            this.radioButtonFemenine.Text = "F";
            this.radioButtonFemenine.UseVisualStyleBackColor = true;
            // 
            // radioButtonMasculine
            // 
            this.radioButtonMasculine.AutoSize = true;
            this.radioButtonMasculine.Location = new System.Drawing.Point(6, 28);
            this.radioButtonMasculine.Name = "radioButtonMasculine";
            this.radioButtonMasculine.Size = new System.Drawing.Size(41, 25);
            this.radioButtonMasculine.TabIndex = 0;
            this.radioButtonMasculine.TabStop = true;
            this.radioButtonMasculine.Text = "M";
            this.radioButtonMasculine.UseVisualStyleBackColor = true;
            // 
            // buttonCalculate
            // 
            this.buttonCalculate.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonCalculate.Cursor = System.Windows.Forms.Cursors.Hand;
            this.buttonCalculate.Enabled = false;
            this.buttonCalculate.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonCalculate.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonCalculate.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.buttonCalculate.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonCalculate.Font = new System.Drawing.Font("Segoe UI Semibold", 14F, System.Drawing.FontStyle.Bold);
            this.buttonCalculate.Location = new System.Drawing.Point(238, 304);
            this.buttonCalculate.Name = "buttonCalculate";
            this.buttonCalculate.Size = new System.Drawing.Size(130, 33);
            this.buttonCalculate.TabIndex = 12;
            this.buttonCalculate.Text = "Calcular";
            this.buttonCalculate.UseVisualStyleBackColor = false;
            this.buttonCalculate.Click += new System.EventHandler(this.ButtonCalculate_Click);
            // 
            // groupBoxResult
            // 
            this.groupBoxResult.Controls.Add(this.labelResult);
            this.groupBoxResult.Font = new System.Drawing.Font("Segoe UI Semibold", 12F, System.Drawing.FontStyle.Italic);
            this.groupBoxResult.Location = new System.Drawing.Point(16, 379);
            this.groupBoxResult.Name = "groupBoxResult";
            this.groupBoxResult.Size = new System.Drawing.Size(419, 183);
            this.groupBoxResult.TabIndex = 13;
            this.groupBoxResult.TabStop = false;
            this.groupBoxResult.Text = "Resultado";
            // 
            // labelResult
            // 
            this.labelResult.Font = new System.Drawing.Font("Segoe UI Semibold", 12F);
            this.labelResult.Location = new System.Drawing.Point(6, 25);
            this.labelResult.Name = "labelResult";
            this.labelResult.Size = new System.Drawing.Size(407, 155);
            this.labelResult.TabIndex = 0;
            // 
            // buttonExit
            // 
            this.buttonExit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.buttonExit.Cursor = System.Windows.Forms.Cursors.Hand;
            this.buttonExit.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.buttonExit.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.buttonExit.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.buttonExit.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonExit.Font = new System.Drawing.Font("Segoe UI Semibold", 12F, System.Drawing.FontStyle.Bold);
            this.buttonExit.Location = new System.Drawing.Point(16, 568);
            this.buttonExit.Name = "buttonExit";
            this.buttonExit.Size = new System.Drawing.Size(130, 33);
            this.buttonExit.TabIndex = 14;
            this.buttonExit.Text = "Salir";
            this.buttonExit.UseVisualStyleBackColor = false;
            this.buttonExit.Click += new System.EventHandler(this.ButtonExit_Click);
            // 
            // buttonNew
            // 
            this.buttonNew.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonNew.Cursor = System.Windows.Forms.Cursors.Hand;
            this.buttonNew.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonNew.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonNew.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.buttonNew.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonNew.Font = new System.Drawing.Font("Segoe UI Semibold", 12F, System.Drawing.FontStyle.Bold);
            this.buttonNew.Location = new System.Drawing.Point(305, 568);
            this.buttonNew.Name = "buttonNew";
            this.buttonNew.Size = new System.Drawing.Size(130, 33);
            this.buttonNew.TabIndex = 15;
            this.buttonNew.Text = "Nuevo";
            this.buttonNew.UseVisualStyleBackColor = false;
            this.buttonNew.Click += new System.EventHandler(this.ButtonNew_Click);
            // 
            // labelCurrency
            // 
            this.labelCurrency.AutoSize = true;
            this.labelCurrency.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelCurrency.Location = new System.Drawing.Point(162, 200);
            this.labelCurrency.Name = "labelCurrency";
            this.labelCurrency.Size = new System.Drawing.Size(19, 21);
            this.labelCurrency.TabIndex = 16;
            this.labelCurrency.Text = "$";
            // 
            // QuotationWindow
            // 
            this.AcceptButton = this.buttonCalculate;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(236)))), ((int)(((byte)(233)))), ((int)(((byte)(217)))));
            this.ClientSize = new System.Drawing.Size(447, 613);
            this.Controls.Add(this.labelCurrency);
            this.Controls.Add(this.buttonNew);
            this.Controls.Add(this.buttonExit);
            this.Controls.Add(this.groupBoxResult);
            this.Controls.Add(this.buttonCalculate);
            this.Controls.Add(this.groupBoxGender);
            this.Controls.Add(this.checkBoxGreeting);
            this.Controls.Add(this.checkBoxSyndicateMember);
            this.Controls.Add(this.textBoxSalary);
            this.Controls.Add(this.labelSalary);
            this.Controls.Add(this.numericUpDownSons);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBoxName);
            this.Controls.Add(this.labelName);
            this.Controls.Add(this.menuStrip1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "QuotationWindow";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Auxilios Familiares";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownSons)).EndInit();
            this.groupBoxGender.ResumeLayout(false);
            this.groupBoxGender.PerformLayout();
            this.groupBoxResult.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem opcionesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuCalculate;
        private System.Windows.Forms.ToolStripMenuItem toolStripNew;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuExit;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem2;
        private System.Windows.Forms.Label labelName;
        private System.Windows.Forms.TextBox textBoxName;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.NumericUpDown numericUpDownSons;
        private System.Windows.Forms.Label labelSalary;
        private System.Windows.Forms.TextBox textBoxSalary;
        private System.Windows.Forms.CheckBox checkBoxSyndicateMember;
        private System.Windows.Forms.CheckBox checkBoxGreeting;
        private System.Windows.Forms.GroupBox groupBoxGender;
        private System.Windows.Forms.RadioButton radioButtonTrans;
        private System.Windows.Forms.RadioButton radioButtonFemenine;
        private System.Windows.Forms.RadioButton radioButtonMasculine;
        private System.Windows.Forms.Button buttonCalculate;
        private System.Windows.Forms.GroupBox groupBoxResult;
        private System.Windows.Forms.Button buttonExit;
        private System.Windows.Forms.Button buttonNew;
        private System.Windows.Forms.Label labelResult;
        private System.Windows.Forms.Label labelCurrency;
    }
}