module.exports = {
  mode:'jit',
  purge: [
    './src/**/*.html',
    './src/**/*.js',
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      backgroundImage: {
        'banner': "url('https://i.imgur.com/jKV8zmd.jpeg')", 
      }, gridTemplateRows: {
        '40/60': '40vh 60vh'
      },
      width: {
        '18': '280px',
      }
    }
  },
  variants: {
    extend: {},
  },
  plugins: [],

  
}
