
using System.Globalization;

namespace Vecindad
{
    partial class FormPrincipal
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormPrincipal));
            this.labelTitulo = new System.Windows.Forms.Label();
            this.labelNroApto = new System.Windows.Forms.Label();
            this.labelDuenio = new System.Windows.Forms.Label();
            this.labelInquilino = new System.Windows.Forms.Label();
            this.textBoxDuenio = new System.Windows.Forms.TextBox();
            this.labelNroAdultos = new System.Windows.Forms.Label();
            this.labelNroNinios = new System.Windows.Forms.Label();
            this.textBoxInquilino = new System.Windows.Forms.TextBox();
            this.labelDatos = new System.Windows.Forms.Label();
            this.labelValores = new System.Windows.Forms.Label();
            this.labelCostoFijo = new System.Windows.Forms.Label();
            this.labelPisicina = new System.Windows.Forms.Label();
            this.labelJuegos = new System.Windows.Forms.Label();
            this.labelZonasSociales = new System.Windows.Forms.Label();
            this.labelAseo = new System.Windows.Forms.Label();
            this.labelSubtotal = new System.Windows.Forms.Label();
            this.labelDescuento = new System.Windows.Forms.Label();
            this.numericUpDownNinios = new System.Windows.Forms.NumericUpDown();
            this.numericUpDownAdultos = new System.Windows.Forms.NumericUpDown();
            this.labelTotal = new System.Windows.Forms.Label();
            this.buttonRegistrar = new System.Windows.Forms.Button();
            this.buttonVerLista = new System.Windows.Forms.Button();
            this.textBoxNroApto = new System.Windows.Forms.TextBox();
            this.labelValorCostoFijo = new System.Windows.Forms.Label();
            this.labelValorPiscina = new System.Windows.Forms.Label();
            this.labelValorJuegos = new System.Windows.Forms.Label();
            this.labelValorZonasSociales = new System.Windows.Forms.Label();
            this.labelValorAseo = new System.Windows.Forms.Label();
            this.labelValorSubtotal = new System.Windows.Forms.Label();
            this.labelValorDescuento = new System.Windows.Forms.Label();
            this.labelValorTotal = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownNinios)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownAdultos)).BeginInit();
            this.SuspendLayout();
            // 
            // labelTitulo
            // 
            this.labelTitulo.Dock = System.Windows.Forms.DockStyle.Top;
            this.labelTitulo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelTitulo.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelTitulo.Location = new System.Drawing.Point(0, 0);
            this.labelTitulo.Name = "labelTitulo";
            this.labelTitulo.Size = new System.Drawing.Size(578, 58);
            this.labelTitulo.TabIndex = 1;
            this.labelTitulo.Text = "CONDOMINIO LA 8 VECINDAD";
            this.labelTitulo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelNroApto
            // 
            this.labelNroApto.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelNroApto.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelNroApto.Location = new System.Drawing.Point(12, 107);
            this.labelNroApto.Name = "labelNroApto";
            this.labelNroApto.Size = new System.Drawing.Size(207, 32);
            this.labelNroApto.TabIndex = 2;
            this.labelNroApto.Text = "N° Apto";
            this.labelNroApto.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelDuenio
            // 
            this.labelDuenio.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelDuenio.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelDuenio.Location = new System.Drawing.Point(12, 178);
            this.labelDuenio.Name = "labelDuenio";
            this.labelDuenio.Size = new System.Drawing.Size(207, 32);
            this.labelDuenio.TabIndex = 4;
            this.labelDuenio.Text = "Dueño";
            this.labelDuenio.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelInquilino
            // 
            this.labelInquilino.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelInquilino.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelInquilino.Location = new System.Drawing.Point(12, 249);
            this.labelInquilino.Name = "labelInquilino";
            this.labelInquilino.Size = new System.Drawing.Size(207, 32);
            this.labelInquilino.TabIndex = 5;
            this.labelInquilino.Text = "Inquilino";
            this.labelInquilino.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // textBoxDuenio
            // 
            this.textBoxDuenio.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.textBoxDuenio.Location = new System.Drawing.Point(12, 213);
            this.textBoxDuenio.MaxLength = 100;
            this.textBoxDuenio.Name = "textBoxDuenio";
            this.textBoxDuenio.Size = new System.Drawing.Size(207, 33);
            this.textBoxDuenio.TabIndex = 7;
            this.textBoxDuenio.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.textBoxDuenio.TextChanged += new System.EventHandler(this.TextBox_TextChanged);
            this.textBoxDuenio.Enter += new System.EventHandler(this.TextBox_Enter);
            this.textBoxDuenio.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // labelNroAdultos
            // 
            this.labelNroAdultos.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelNroAdultos.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelNroAdultos.Location = new System.Drawing.Point(12, 320);
            this.labelNroAdultos.Name = "labelNroAdultos";
            this.labelNroAdultos.Size = new System.Drawing.Size(207, 32);
            this.labelNroAdultos.TabIndex = 8;
            this.labelNroAdultos.Text = "N° Adultos";
            this.labelNroAdultos.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelNroNinios
            // 
            this.labelNroNinios.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelNroNinios.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelNroNinios.Location = new System.Drawing.Point(12, 391);
            this.labelNroNinios.Name = "labelNroNinios";
            this.labelNroNinios.Size = new System.Drawing.Size(207, 32);
            this.labelNroNinios.TabIndex = 9;
            this.labelNroNinios.Text = "N° Niños";
            this.labelNroNinios.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // textBoxInquilino
            // 
            this.textBoxInquilino.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.textBoxInquilino.Location = new System.Drawing.Point(12, 284);
            this.textBoxInquilino.MaxLength = 100;
            this.textBoxInquilino.Name = "textBoxInquilino";
            this.textBoxInquilino.Size = new System.Drawing.Size(207, 33);
            this.textBoxInquilino.TabIndex = 10;
            this.textBoxInquilino.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.textBoxInquilino.TextChanged += new System.EventHandler(this.TextBoxInquilino_TextChanged);
            this.textBoxInquilino.Enter += new System.EventHandler(this.TextBox_Enter);
            this.textBoxInquilino.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // labelDatos
            // 
            this.labelDatos.AutoSize = true;
            this.labelDatos.Font = new System.Drawing.Font("Segoe UI Semibold", 15.75F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelDatos.Location = new System.Drawing.Point(78, 69);
            this.labelDatos.Name = "labelDatos";
            this.labelDatos.Size = new System.Drawing.Size(68, 30);
            this.labelDatos.TabIndex = 13;
            this.labelDatos.Text = "Datos";
            // 
            // labelValores
            // 
            this.labelValores.AutoSize = true;
            this.labelValores.Font = new System.Drawing.Font("Segoe UI Semibold", 15.75F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValores.Location = new System.Drawing.Point(275, 69);
            this.labelValores.Name = "labelValores";
            this.labelValores.Size = new System.Drawing.Size(252, 30);
            this.labelValores.TabIndex = 14;
            this.labelValores.Text = "Costos de administración";
            // 
            // labelCostoFijo
            // 
            this.labelCostoFijo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelCostoFijo.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelCostoFijo.Location = new System.Drawing.Point(248, 359);
            this.labelCostoFijo.Name = "labelCostoFijo";
            this.labelCostoFijo.Size = new System.Drawing.Size(145, 32);
            this.labelCostoFijo.TabIndex = 15;
            this.labelCostoFijo.Text = "Costo fijo";
            this.labelCostoFijo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelPisicina
            // 
            this.labelPisicina.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelPisicina.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelPisicina.Location = new System.Drawing.Point(243, 123);
            this.labelPisicina.Name = "labelPisicina";
            this.labelPisicina.Size = new System.Drawing.Size(145, 32);
            this.labelPisicina.TabIndex = 17;
            this.labelPisicina.Text = "Piscina";
            this.labelPisicina.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelJuegos
            // 
            this.labelJuegos.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelJuegos.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelJuegos.Location = new System.Drawing.Point(243, 162);
            this.labelJuegos.Name = "labelJuegos";
            this.labelJuegos.Size = new System.Drawing.Size(145, 32);
            this.labelJuegos.TabIndex = 24;
            this.labelJuegos.Text = "Juegos";
            this.labelJuegos.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelZonasSociales
            // 
            this.labelZonasSociales.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelZonasSociales.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelZonasSociales.Location = new System.Drawing.Point(238, 201);
            this.labelZonasSociales.Name = "labelZonasSociales";
            this.labelZonasSociales.Size = new System.Drawing.Size(150, 32);
            this.labelZonasSociales.TabIndex = 25;
            this.labelZonasSociales.Text = "Zonas sociales";
            this.labelZonasSociales.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelAseo
            // 
            this.labelAseo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelAseo.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelAseo.Location = new System.Drawing.Point(243, 240);
            this.labelAseo.Name = "labelAseo";
            this.labelAseo.Size = new System.Drawing.Size(145, 32);
            this.labelAseo.TabIndex = 26;
            this.labelAseo.Text = "Aseo";
            this.labelAseo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelSubtotal
            // 
            this.labelSubtotal.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelSubtotal.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelSubtotal.Location = new System.Drawing.Point(243, 283);
            this.labelSubtotal.Name = "labelSubtotal";
            this.labelSubtotal.Size = new System.Drawing.Size(145, 32);
            this.labelSubtotal.TabIndex = 27;
            this.labelSubtotal.Text = "Subtotal";
            this.labelSubtotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // labelDescuento
            // 
            this.labelDescuento.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelDescuento.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelDescuento.Location = new System.Drawing.Point(248, 320);
            this.labelDescuento.Name = "labelDescuento";
            this.labelDescuento.Size = new System.Drawing.Size(140, 32);
            this.labelDescuento.TabIndex = 28;
            this.labelDescuento.Text = "Descuento";
            this.labelDescuento.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // numericUpDownNinios
            // 
            this.numericUpDownNinios.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.numericUpDownNinios.Location = new System.Drawing.Point(12, 426);
            this.numericUpDownNinios.Maximum = new decimal(new int[] {
            9,
            0,
            0,
            0});
            this.numericUpDownNinios.Name = "numericUpDownNinios";
            this.numericUpDownNinios.Size = new System.Drawing.Size(207, 33);
            this.numericUpDownNinios.TabIndex = 29;
            this.numericUpDownNinios.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.numericUpDownNinios.ValueChanged += new System.EventHandler(this.NumericUpDown_ValueChanged);
            this.numericUpDownNinios.Enter += new System.EventHandler(this.TextBox_Enter);
            this.numericUpDownNinios.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // numericUpDownAdultos
            // 
            this.numericUpDownAdultos.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.numericUpDownAdultos.Location = new System.Drawing.Point(12, 355);
            this.numericUpDownAdultos.Maximum = new decimal(new int[] {
            9,
            0,
            0,
            0});
            this.numericUpDownAdultos.Name = "numericUpDownAdultos";
            this.numericUpDownAdultos.Size = new System.Drawing.Size(207, 33);
            this.numericUpDownAdultos.TabIndex = 30;
            this.numericUpDownAdultos.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.numericUpDownAdultos.ValueChanged += new System.EventHandler(this.NumericUpDown_ValueChanged);
            this.numericUpDownAdultos.Enter += new System.EventHandler(this.TextBox_Enter);
            this.numericUpDownAdultos.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // labelTotal
            // 
            this.labelTotal.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelTotal.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelTotal.Location = new System.Drawing.Point(248, 391);
            this.labelTotal.Name = "labelTotal";
            this.labelTotal.Size = new System.Drawing.Size(140, 32);
            this.labelTotal.TabIndex = 31;
            this.labelTotal.Text = "Total";
            this.labelTotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // buttonRegistrar
            // 
            this.buttonRegistrar.AutoSize = true;
            this.buttonRegistrar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(200)))), ((int)(((byte)(233)))), ((int)(((byte)(233)))));
            this.buttonRegistrar.Enabled = false;
            this.buttonRegistrar.FlatAppearance.BorderSize = 0;
            this.buttonRegistrar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Aqua;
            this.buttonRegistrar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.buttonRegistrar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonRegistrar.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.buttonRegistrar.Location = new System.Drawing.Point(288, 450);
            this.buttonRegistrar.Name = "buttonRegistrar";
            this.buttonRegistrar.Size = new System.Drawing.Size(100, 39);
            this.buttonRegistrar.TabIndex = 33;
            this.buttonRegistrar.Text = "Registrar";
            this.buttonRegistrar.UseVisualStyleBackColor = false;
            // 
            // buttonVerLista
            // 
            this.buttonVerLista.AutoSize = true;
            this.buttonVerLista.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(162)))), ((int)(((byte)(236)))), ((int)(((byte)(186)))));
            this.buttonVerLista.FlatAppearance.BorderSize = 0;
            this.buttonVerLista.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Lime;
            this.buttonVerLista.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.buttonVerLista.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonVerLista.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.buttonVerLista.Location = new System.Drawing.Point(444, 450);
            this.buttonVerLista.Name = "buttonVerLista";
            this.buttonVerLista.Size = new System.Drawing.Size(100, 39);
            this.buttonVerLista.TabIndex = 34;
            this.buttonVerLista.Text = "Ver Lista";
            this.buttonVerLista.UseVisualStyleBackColor = false;
            // 
            // textBoxNroApto
            // 
            this.textBoxNroApto.Font = new System.Drawing.Font("Segoe UI", 14.25F);
            this.textBoxNroApto.Location = new System.Drawing.Point(12, 142);
            this.textBoxNroApto.MaxLength = 3;
            this.textBoxNroApto.Name = "textBoxNroApto";
            this.textBoxNroApto.Size = new System.Drawing.Size(207, 33);
            this.textBoxNroApto.TabIndex = 3;
            this.textBoxNroApto.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.textBoxNroApto.TextChanged += new System.EventHandler(this.TextBox_TextChanged);
            this.textBoxNroApto.Enter += new System.EventHandler(this.TextBox_Enter);
            this.textBoxNroApto.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.TextBox_KeyPress_LimitarNumeros);
            this.textBoxNroApto.Leave += new System.EventHandler(this.TextBox_Leave);
            // 
            // labelValorCostoFijo
            // 
            this.labelValorCostoFijo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorCostoFijo.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorCostoFijo.Location = new System.Drawing.Point(394, 359);
            this.labelValorCostoFijo.Name = "labelValorCostoFijo";
            this.labelValorCostoFijo.Size = new System.Drawing.Size(164, 32);
            this.labelValorCostoFijo.TabIndex = 35;
            this.labelValorCostoFijo.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorPiscina
            // 
            this.labelValorPiscina.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorPiscina.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorPiscina.Location = new System.Drawing.Point(389, 123);
            this.labelValorPiscina.Name = "labelValorPiscina";
            this.labelValorPiscina.Size = new System.Drawing.Size(164, 32);
            this.labelValorPiscina.TabIndex = 36;
            this.labelValorPiscina.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorJuegos
            // 
            this.labelValorJuegos.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorJuegos.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorJuegos.Location = new System.Drawing.Point(389, 162);
            this.labelValorJuegos.Name = "labelValorJuegos";
            this.labelValorJuegos.Size = new System.Drawing.Size(164, 32);
            this.labelValorJuegos.TabIndex = 37;
            this.labelValorJuegos.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorZonasSociales
            // 
            this.labelValorZonasSociales.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorZonasSociales.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorZonasSociales.Location = new System.Drawing.Point(389, 201);
            this.labelValorZonasSociales.Name = "labelValorZonasSociales";
            this.labelValorZonasSociales.Size = new System.Drawing.Size(164, 32);
            this.labelValorZonasSociales.TabIndex = 38;
            this.labelValorZonasSociales.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorAseo
            // 
            this.labelValorAseo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorAseo.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorAseo.Location = new System.Drawing.Point(389, 240);
            this.labelValorAseo.Name = "labelValorAseo";
            this.labelValorAseo.Size = new System.Drawing.Size(164, 32);
            this.labelValorAseo.TabIndex = 39;
            this.labelValorAseo.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorSubtotal
            // 
            this.labelValorSubtotal.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorSubtotal.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorSubtotal.Location = new System.Drawing.Point(389, 283);
            this.labelValorSubtotal.Name = "labelValorSubtotal";
            this.labelValorSubtotal.Size = new System.Drawing.Size(164, 32);
            this.labelValorSubtotal.TabIndex = 40;
            this.labelValorSubtotal.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorDescuento
            // 
            this.labelValorDescuento.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorDescuento.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorDescuento.Location = new System.Drawing.Point(394, 320);
            this.labelValorDescuento.Name = "labelValorDescuento";
            this.labelValorDescuento.Size = new System.Drawing.Size(164, 32);
            this.labelValorDescuento.TabIndex = 41;
            this.labelValorDescuento.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // labelValorTotal
            // 
            this.labelValorTotal.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.labelValorTotal.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelValorTotal.Location = new System.Drawing.Point(394, 391);
            this.labelValorTotal.Name = "labelValorTotal";
            this.labelValorTotal.Size = new System.Drawing.Size(164, 32);
            this.labelValorTotal.TabIndex = 42;
            this.labelValorTotal.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // FormPrincipal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(578, 501);
            this.Controls.Add(this.labelValorTotal);
            this.Controls.Add(this.labelValorDescuento);
            this.Controls.Add(this.labelValorSubtotal);
            this.Controls.Add(this.labelValorAseo);
            this.Controls.Add(this.labelValorZonasSociales);
            this.Controls.Add(this.labelValorJuegos);
            this.Controls.Add(this.labelValorPiscina);
            this.Controls.Add(this.labelValorCostoFijo);
            this.Controls.Add(this.buttonVerLista);
            this.Controls.Add(this.buttonRegistrar);
            this.Controls.Add(this.labelTotal);
            this.Controls.Add(this.numericUpDownAdultos);
            this.Controls.Add(this.numericUpDownNinios);
            this.Controls.Add(this.labelDescuento);
            this.Controls.Add(this.labelSubtotal);
            this.Controls.Add(this.labelAseo);
            this.Controls.Add(this.labelZonasSociales);
            this.Controls.Add(this.labelJuegos);
            this.Controls.Add(this.labelPisicina);
            this.Controls.Add(this.labelCostoFijo);
            this.Controls.Add(this.labelValores);
            this.Controls.Add(this.labelDatos);
            this.Controls.Add(this.textBoxInquilino);
            this.Controls.Add(this.labelNroNinios);
            this.Controls.Add(this.labelNroAdultos);
            this.Controls.Add(this.textBoxDuenio);
            this.Controls.Add(this.labelInquilino);
            this.Controls.Add(this.labelDuenio);
            this.Controls.Add(this.textBoxNroApto);
            this.Controls.Add(this.labelNroApto);
            this.Controls.Add(this.labelTitulo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.Name = "FormPrincipal";
            this.ShowInTaskbar = false;
            this.Text = "Condominio la 8 vecindad";
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownNinios)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownAdultos)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelTitulo;
        private System.Windows.Forms.Label labelNroApto;
        private System.Windows.Forms.Label labelDuenio;
        private System.Windows.Forms.Label labelInquilino;
        private System.Windows.Forms.TextBox textBoxDuenio;
        private System.Windows.Forms.Label labelNroAdultos;
        private System.Windows.Forms.Label labelNroNinios;
        private System.Windows.Forms.TextBox textBoxInquilino;
        private System.Windows.Forms.Label labelDatos;
        private System.Windows.Forms.Label labelValores;
        private System.Windows.Forms.Label labelCostoFijo;
        private System.Windows.Forms.Label labelPisicina;
        private System.Windows.Forms.Label labelJuegos;
        private System.Windows.Forms.Label labelZonasSociales;
        private System.Windows.Forms.Label labelAseo;
        private System.Windows.Forms.Label labelSubtotal;
        private System.Windows.Forms.Label labelDescuento;
        private System.Windows.Forms.NumericUpDown numericUpDownNinios;
        private System.Windows.Forms.NumericUpDown numericUpDownAdultos;
        private System.Windows.Forms.Label labelTotal;
        private System.Windows.Forms.Button buttonRegistrar;
        private System.Windows.Forms.Button buttonVerLista;
        private System.Windows.Forms.TextBox textBoxNroApto;
        private System.Windows.Forms.Label labelValorCostoFijo;
        private System.Windows.Forms.Label labelValorPiscina;
        private System.Windows.Forms.Label labelValorJuegos;
        private System.Windows.Forms.Label labelValorZonasSociales;
        private System.Windows.Forms.Label labelValorAseo;
        private System.Windows.Forms.Label labelValorSubtotal;
        private System.Windows.Forms.Label labelValorDescuento;
        private System.Windows.Forms.Label labelValorTotal;
    }
}

