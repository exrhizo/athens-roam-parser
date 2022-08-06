declare module 'athens-roam-parser' {
  export function parseToAst(str: string): any;
  export function parseToStructure(str: string): ParseVector;
}

// TODO: Build out this type to be more accurate.  
type ParseVector = (string | ParseVector | Record<string, string>)[];
